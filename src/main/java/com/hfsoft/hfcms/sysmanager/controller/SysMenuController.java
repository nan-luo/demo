package com.hfsoft.hfcms.sysmanager.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hfsoft.hfcms.sysmanager.domain.SysMenu;
import com.hfsoft.hfcms.sysmanager.mapper.SysMenuMapper;
import com.hfsoft.hfcms.sysmanager.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
@RestController
@RequestMapping("sysMenu")
public class SysMenuController extends ApiController {

    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @GetMapping
    public R selectAll(Page<SysMenu> page, SysMenu sysMenu){
        return success(this.sysMenuService.page(page,new QueryWrapper<>(sysMenu)));
    }


    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id){
        return success(this.sysMenuService.getById(id));
    }

    @PostMapping("/insert")
    public R insert(@RequestBody SysMenu sysMenu){
        return success(this.sysMenuService.save(sysMenu));
    }

    @PostMapping("/update")
    public R update(@RequestBody SysMenu sysMenu){
        return success(this.sysMenuService.updateById(sysMenu));
    }

    @PostMapping("/delete")
    public R delete(@RequestParam("idList") List<Long> idList){
        return success(this.sysMenuService.removeByIds(idList));
    }

    @GetMapping("/findUserByFuzzyUserName")
    @ResponseBody
    public R getUserByFuzzyUserName(Page<SysMenu> page , String name) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.like("menu_name",name);
        return success(this.sysMenuService.page(page,queryWrapper));
    }

    @GetMapping("/getSubmenu")
    @ResponseBody
    public R getSubmenu(Long parentId) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("parent_id",parentId);
        return success(sysMenuMapper.selectList(queryWrapper));
    }

    @RequestMapping(value = "/treeload")
    @ResponseBody
    public List<HashMap<String, Object>> treeload(){
        List<SysMenu> dpet = sysMenuService.getSubmenu(0L);    //查找一级菜单
        List<HashMap<String, Object>> result = new ArrayList<>();    //定义一个map处理json键名问题
        result= sysMenuService.fun(dpet, result);
        System.out.println(result);
        return result;

    }
/*    public List<HashMap<String, Object>> fun(List<SysMenu> sysMenuList, List<HashMap<String, Object>> result) {

        for (SysMenu sysMenu:sysMenuList){
            HashMap<String, Object> map=new HashMap<>();
            map.put("id",sysMenu.getId());
            map.put("title",sysMenu.getMenuName());
            map.put("spread",true);
            List<HashMap<String, Object>> resutl = new ArrayList<>();
            List<SysMenu> children=sysMenuService.getSubmenu(sysMenu.getId());// 获取当前菜单下的子菜单

            //这里可以根据自己需求判断节点默认选中
*//*            if(m.getParent() != null || m.getChildren().size() == 0){
                map.put("checked", true);    //设置为选中状态
            }else {
                map.put("checked", false);
            }*//*

            map.put("children",fun(children,resutl));
            result.add(map);
        }
        return result;
    }*/
}


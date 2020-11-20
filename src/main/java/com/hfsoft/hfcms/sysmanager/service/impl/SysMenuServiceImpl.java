package com.hfsoft.hfcms.sysmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hfsoft.hfcms.sysmanager.domain.SysMenu;
import com.hfsoft.hfcms.sysmanager.mapper.SysMenuMapper;
import com.hfsoft.hfcms.sysmanager.service.SysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> getSubmenu(Long parentId) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("parent_id",parentId);
        return sysMenuMapper.selectList(queryWrapper);
    }

    @Override
    public List<HashMap<String, Object>> fun(List<SysMenu> sysMenuList, List<HashMap<String, Object>> result) {

        for (SysMenu sysMenu:sysMenuList){
            HashMap<String, Object> map=new HashMap<>();
            map.put("id",sysMenu.getId());
            map.put("title",sysMenu.getMenuName());
            map.put("spread",true);
            List<HashMap<String, Object>> resutl = new ArrayList<>();
            List<SysMenu> children=getSubmenu(sysMenu.getId());// 获取当前菜单下的子菜单

            //这里可以根据自己需求判断节点默认选中
/*            if(m.getParent() != null || m.getChildren().size() == 0){
                map.put("checked", true);    //设置为选中状态
            }else {
                map.put("checked", false);
            }*/

            map.put("children",fun(children,resutl));
            result.add(map);
        }
        return result;
    }
}


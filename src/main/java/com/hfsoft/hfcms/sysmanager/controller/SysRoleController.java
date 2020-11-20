package com.hfsoft.hfcms.sysmanager.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hfsoft.hfcms.sysmanager.domain.SysMenu;
import com.hfsoft.hfcms.sysmanager.domain.SysRole;
import com.hfsoft.hfcms.sysmanager.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
@RestController
@RequestMapping("sysRole")
public class SysRoleController extends ApiController {

    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping
    public R selectAll(Page<SysRole> page,SysRole sysRole){
        return success(this.sysRoleService.page(page,new QueryWrapper<>(sysRole)));
    }

    @PostMapping("/insert")
    public R insert(@RequestBody SysRole sysRole){
        return success(this.sysRoleService.save(sysRole));
    }

    @PostMapping("/delete")
    public R delete(@RequestParam("id") Long id){
        return success(this.sysRoleService.removeById(id));
    }

    @PostMapping("/update")
    public R update(@RequestBody SysRole SysRole){
        return success(this.sysRoleService.updateById(SysRole));
    }

    @GetMapping("/queryByRoleName")
    @ResponseBody
    public R queryByRoleName(Page<SysRole> page , String name){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.like("role_name",name);
        return success(this.sysRoleService.page(page,queryWrapper));
    }
}


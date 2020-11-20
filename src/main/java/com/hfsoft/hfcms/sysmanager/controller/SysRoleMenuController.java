package com.hfsoft.hfcms.sysmanager.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
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
@RequestMapping("/sysRoleMenu")
public class SysRoleMenuController  extends ApiController {
    @Autowired
    private SysRoleService sysRoleService;

    @PostMapping("/insert")
    public R insert(@RequestBody SysRole sysRole){
        return success(sysRoleService.save(sysRole));
    }
}


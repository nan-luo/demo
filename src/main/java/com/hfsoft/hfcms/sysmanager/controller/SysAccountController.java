package com.hfsoft.hfcms.sysmanager.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.hfsoft.hfcms.sysmanager.domain.SysAccount;
import com.hfsoft.hfcms.sysmanager.mapper.SysAccountMapper;
import com.hfsoft.hfcms.sysmanager.service.SysAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
@Controller
@RequestMapping("/sysAccount")
public class SysAccountController extends ApiController {

    @Autowired
    private SysAccountService sysAccountService;
    @Autowired
    private SysAccountMapper sysAccountMapper;

    @PostMapping("/login")
    @ResponseBody
    public SysAccount login(String accountName, String cipher){
        System.out.println(accountName);
        System.out.println(cipher);
        SysAccount sysAccount = sysAccountService.name(accountName);
        //账号正确 密码不对
        return sysAccount;
    }
    @PostMapping("/login1")
    @ResponseBody
    public SysAccount login1(String accountName, String cipher) {
        System.out.println(accountName);
        System.out.println(cipher);
        //密码正确 账号不对
        SysAccount sysAccount = sysAccountService.pas(cipher);
        return sysAccount;
    }
    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url) {
        return url;
    }

    @GetMapping("/changePassword")
    @ResponseBody
    public String changePassword(@RequestParam String old_password,String new_password,String again_password){
        QueryWrapper<SysAccount> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cipher",old_password);
        SysAccount sysAccount=sysAccountMapper.selectOne(queryWrapper);
        SysAccount sysAccount1=new SysAccount();
        if (sysAccount != null){
            if (new_password.equals(again_password)){
                sysAccount1.setCipher(new_password);
                sysAccountService.update(sysAccount1,queryWrapper);
                return "密码修改成功";
            }else {
                return "两次密码输入不一致";
            }
        }else {
            return "旧密码输入错误";
        }
    }
}


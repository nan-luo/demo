package com.hfsoft.hfcms.sysmanager.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hfsoft.hfcms.sysmanager.domain.SysAccount;
import com.hfsoft.hfcms.sysmanager.mapper.SysAccountMapper;
import com.hfsoft.hfcms.sysmanager.service.SysAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 花折
 * @date 2020/9/10 15:30
 * @Description
 */
@SpringBootTest
class SysAccountControllerTest {
    @Autowired
    private SysAccountService sysAccountService;
    //@Autowired
    //private SysAccountMapper sysAccountMapper;
    @Test
    void changePassword() {
       // QueryWrapper<SysAccount> queryWrapper=new QueryWrapper<>();
        //queryWrapper.eq("cipher","123");
        //SysAccount sysAccount=sysAccountMapper.selectOne(queryWrapper);
        //System.out.println(sysAccount);
        SysAccount sysAccount=new SysAccount();
        List <SysAccount> list=sysAccountService.list();
        //int p=0;
    }

}
package com.hfsoft.hfcms.sysmanager.service;

import com.hfsoft.hfcms.sysmanager.mapper.SysAccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @date 2020/8/27 11:49
 * @Description
 */
@SpringBootTest
class SysAccountServiceTest {

    @Autowired
    private SysAccountService sysAccountService;
    @Autowired
    private SysAccountMapper sysAccountMapper;

    @Test
    void login() {
        System.out.println(sysAccountService.login("456", "456545"));
    }
}
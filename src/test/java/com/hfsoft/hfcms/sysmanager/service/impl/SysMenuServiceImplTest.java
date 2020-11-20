package com.hfsoft.hfcms.sysmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hfsoft.hfcms.sysmanager.domain.SysMenu;
import com.hfsoft.hfcms.sysmanager.mapper.SysMenuMapper;
import com.hfsoft.hfcms.sysmanager.service.SysMenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 花折
 * @date 2020/9/14 17:59
 * @Description
 */
@SpringBootTest
class SysMenuServiceImplTest {


    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Test
    void submenu() {
        Long parentId=7l;
       sysMenuService.getSubmenu(parentId).forEach(System.out::println);
    }
}
package com.hfsoft.hfcms.sysmanager.service;

import com.hfsoft.hfcms.sysmanager.domain.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> getSubmenu(Long parentId);
     List<HashMap<String, Object>> fun(List<SysMenu> sysMenuList, List<HashMap<String, Object>> result);
}

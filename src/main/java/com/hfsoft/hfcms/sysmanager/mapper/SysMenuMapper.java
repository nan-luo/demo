package com.hfsoft.hfcms.sysmanager.mapper;

import com.hfsoft.hfcms.sysmanager.domain.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    //获取一个菜单下的子菜单
     List<SysMenu> getSubmenu(Long parentId);
}

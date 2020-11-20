package com.hfsoft.hfcms.sysmanager.service;

import com.hfsoft.hfcms.sysmanager.domain.SysAccount;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
public interface SysAccountService extends IService<SysAccount> {
    SysAccount login(String accountName,String cipher);
    SysAccount name(String accountName);
    SysAccount pas(String cipher);
}

package com.hfsoft.hfcms.sysmanager.service.impl;

import com.hfsoft.hfcms.sysmanager.domain.SysAccount;
import com.hfsoft.hfcms.sysmanager.mapper.SysAccountMapper;
import com.hfsoft.hfcms.sysmanager.service.SysAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
@Service("SysAccountService")
public class SysAccountServiceImpl extends ServiceImpl<SysAccountMapper, SysAccount> implements SysAccountService {

    @Autowired
    private SysAccountMapper sysAccountMapper;
    @Override
    public SysAccount login(String accountName, String cipher) {
        return sysAccountMapper.login(accountName,cipher);
    }

    @Override
    public SysAccount name(String accountName) {
        return sysAccountMapper.name(accountName);


    }

    @Override
    public SysAccount pas(String cipher) {
        return sysAccountMapper.pas(cipher);
    }

}

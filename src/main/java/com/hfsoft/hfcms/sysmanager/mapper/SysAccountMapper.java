package com.hfsoft.hfcms.sysmanager.mapper;

import com.hfsoft.hfcms.sysmanager.domain.SysAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 * @author admin
 * @since 2020-08-25
 */
@Repository
public interface SysAccountMapper extends BaseMapper<SysAccount> {
     SysAccount login(String accountName,String cipher);
     SysAccount name(String accountName);
     SysAccount pas(String accountName);
}

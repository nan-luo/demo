package com.hfsoft.hfcms.sysmanager.domain;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
public class SysUserRole implements Serializable {

    private static final long serialVersionUID=1L;

      private Long id;

    private Long roleId;

    private Long accountId;

    
    public Long getId() {
        return id;
    }

      public void setId(Long id) {
          this.id = id;
      }
    
    public Long getRoleId() {
        return roleId;
    }

      public void setRoleId(Long roleId) {
          this.roleId = roleId;
      }
    
    public Long getAccountId() {
        return accountId;
    }

      public void setAccountId(Long accountId) {
          this.accountId = accountId;
      }

    @Override
    public String toString() {
        return "SysUserRole{" +
              "id=" + id +
                  ", roleId=" + roleId +
                  ", accountId=" + accountId +
              "}";
    }
}

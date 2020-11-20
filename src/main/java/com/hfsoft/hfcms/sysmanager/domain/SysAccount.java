package com.hfsoft.hfcms.sysmanager.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
public class SysAccount implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

    private String realName;

    private String accountName;

    private String cipher;

    private Long userId;

    private String type;

    private String remark;

    private LocalDateTime createTime;

    private String createUser;

    private LocalDateTime updateTime;

    private String updateUser;

    
    public Long getId() {
        return id;
    }

      public void setId(Long id) {
          this.id = id;
      }
    
    public String getRealName() {
        return realName;
    }

      public void setRealName(String realName) {
          this.realName = realName;
      }
    
    public String getAccountName() {
        return accountName;
    }

      public void setAccountName(String accountName) {
          this.accountName = accountName;
      }
    
    public String getCipher() {
        return cipher;
    }

      public void setCipher(String cipher) {
          this.cipher = cipher;
      }
    
    public Long getUserId() {
        return userId;
    }

      public void setUserId(Long userId) {
          this.userId = userId;
      }
    
    public String getType() {
        return type;
    }

      public void setType(String type) {
          this.type = type;
      }
    
    public String getRemark() {
        return remark;
    }

      public void setRemark(String remark) {
          this.remark = remark;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public String getCreateUser() {
        return createUser;
    }

      public void setCreateUser(String createUser) {
          this.createUser = createUser;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }
    
    public String getUpdateUser() {
        return updateUser;
    }

      public void setUpdateUser(String updateUser) {
          this.updateUser = updateUser;
      }

    @Override
    public String toString() {
        return "SysAccount{" +
              "id=" + id +
                  ", realName=" + realName +
                  ", accountName=" + accountName +
                  ", cipher=" + cipher +
                  ", userId=" + userId +
                  ", type=" + type +
                  ", remark=" + remark +
                  ", createTime=" + createTime +
                  ", createUser=" + createUser +
                  ", updateTime=" + updateTime +
                  ", updateUser=" + updateUser +
              "}";
    }
}

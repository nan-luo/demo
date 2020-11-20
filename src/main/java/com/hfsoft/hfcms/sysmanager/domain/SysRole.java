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
public class SysRole implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

    private String roleName;

    private String description;

      /**
     * 0否1是
     */
      private Integer available;

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
    
    public String getRoleName() {
        return roleName;
    }

      public void setRoleName(String roleName) {
          this.roleName = roleName;
      }
    
    public String getDescription() {
        return description;
    }

      public void setDescription(String description) {
          this.description = description;
      }
    
    public Integer getAvailable() {
        return available;
    }

      public void setAvailable(Integer available) {
          this.available = available;
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
        return "SysRole{" +
              "id=" + id +
                  ", roleName=" + roleName +
                  ", description=" + description +
                  ", available=" + available +
                  ", createTime=" + createTime +
                  ", createUser=" + createUser +
                  ", updateTime=" + updateTime +
                  ", updateUser=" + updateUser +
              "}";
    }
}

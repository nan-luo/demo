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
public class SysMenu implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

    private String menuName;

      /**
     * menu | button
     */
      private String menuType;

    private String url;

    private String icon;

      /**
     * 例如：menu  role:*, button role:create,role:update,role:delete,role:view
     */
      private String perms;

    private Long parentId;

      /**
     * 0否1是
     */
      private Integer available;

    private Integer orderNum;

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
    
    public String getMenuName() {
        return menuName;
    }

      public void setMenuName(String menuName) {
          this.menuName = menuName;
      }
    
    public String getMenuType() {
        return menuType;
    }

      public void setMenuType(String menuType) {
          this.menuType = menuType;
      }
    
    public String getUrl() {
        return url;
    }

      public void setUrl(String url) {
          this.url = url;
      }
    
    public String getIcon() {
        return icon;
    }

      public void setIcon(String icon) {
          this.icon = icon;
      }
    
    public String getPerms() {
        return perms;
    }

      public void setPerms(String perms) {
          this.perms = perms;
      }
    
    public Long getParentId() {
        return parentId;
    }

      public void setParentId(Long parentId) {
          this.parentId = parentId;
      }
    
    public Integer getAvailable() {
        return available;
    }

      public void setAvailable(Integer available) {
          this.available = available;
      }
    
    public Integer getOrderNum() {
        return orderNum;
    }

      public void setOrderNum(Integer orderNum) {
          this.orderNum = orderNum;
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
        return "SysMenu{" +
              "id=" + id +
                  ", menuName=" + menuName +
                  ", menuType=" + menuType +
                  ", url=" + url +
                  ", icon=" + icon +
                  ", perms=" + perms +
                  ", parentId=" + parentId +
                  ", available=" + available +
                  ", orderNum=" + orderNum +
                  ", createTime=" + createTime +
                  ", createUser=" + createUser +
                  ", updateTime=" + updateTime +
                  ", updateUser=" + updateUser +
              "}";
    }
}

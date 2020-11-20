package com.hfsoft.hfcms.sysmanager.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2020-08-25
 */
public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

    private Long roleId;

    private Long menuId;

    
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
    
    public Long getMenuId() {
        return menuId;
    }

      public void setMenuId(Long menuId) {
          this.menuId = menuId;
      }

    @Override
    public String toString() {
        return "SysRoleMenu{" +
              "id=" + id +
                  ", roleId=" + roleId +
                  ", menuId=" + menuId +
              "}";
    }
}

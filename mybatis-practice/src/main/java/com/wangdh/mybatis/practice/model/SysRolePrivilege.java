package com.wangdh.mybatis.practice.model;

/**
 * @author wangdh
 * @Description
 * @date 2018-02-05
 */
public class SysRolePrivilege {
    /**
     * 角色id
     */
    private Long roleId;
    /**
     * 权限id
     */
    private Long privilegeId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
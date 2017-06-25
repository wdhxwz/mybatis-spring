package com.wangdh.mybatis.mapper.entity;

import javax.persistence.*;

@Table(name = "tb_user_role")
public class UserRoleEntity {
    @Column(name = "user_id")
    private String userId;

    @Column(name = "role_id")
    private String roleId;

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return role_id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
package com.wangdh.mybatis.mapper.entity;

import javax.persistence.*;

@Table(name = "tb_role")
public class RoleEntity {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "role_name")
    private String roleName;

    private String remark;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
package com.bob.mall.admin.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class UmsUserRoleRelation {
    /**
     * 记录id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "记录id")
    private Integer id;

    /**
     * 后台用户id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "后台用户id")
    private Long adminId;

    /**
     * 角色id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
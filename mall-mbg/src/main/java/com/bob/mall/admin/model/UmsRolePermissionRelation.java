package com.bob.mall.admin.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class UmsRolePermissionRelation {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 角色id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    /**
     * 权限id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "权限id")
    private Integer permissionId;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
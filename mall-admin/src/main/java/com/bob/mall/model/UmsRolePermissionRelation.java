package com.bob.mall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsRolePermissionRelation {
    /**
     * 主键id
     * 
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 角色id
     * 
     */
    @ApiModelProperty(value = "角色id")
    private Long roleId;

    /**
     * 权限id
     * 
     */
    @ApiModelProperty(value = "权限id")
    private Long permissionId;

    /**
     * 创建时间
     * 
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
}
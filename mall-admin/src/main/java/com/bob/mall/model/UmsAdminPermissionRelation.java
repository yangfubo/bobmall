package com.bob.mall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsAdminPermissionRelation {
    /**
     * 主键id
     * 
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 管理员id
     * 
     */
    @ApiModelProperty(value = "管理员id")
    private Long adminId;

    /**
     * 权限id
     * 
     */
    @ApiModelProperty(value = "权限id")
    private Long permissionId;

    /**
     * 类型（0减权限，1加权限）
     * 
     */
    @ApiModelProperty(value = "类型（0减权限，1加权限）")
    private Integer type;

    /**
     * 创建时间
     * 
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
}
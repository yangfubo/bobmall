package com.bob.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsUserRoleRelation {
    /**
     * 主键id
     * 
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 后台用户id
     * 
     */
    @ApiModelProperty(value = "后台用户id")
    private Long adminId;

    /**
     * 角色id
     * 
     */
    @ApiModelProperty(value = "角色id")
    private Long roleId;

    /**
     * 创建时间
     * 
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
}
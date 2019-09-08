package com.bob.mall.admin.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsPermission {
    /**
     * 主键id
     * 
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 父权限id
     * 
     */
    @ApiModelProperty(value = "父权限id")
    private Long pid;

    /**
     * 名称
     * 
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 编码
     * 
     */
    @ApiModelProperty(value = "编码")
    private String code;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     * 
     */
    @ApiModelProperty(value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    /**
     * uri路径
     * 
     */
    @ApiModelProperty(value = "uri路径")
    private String uri;

    /**
     * 排序
     * 
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 状态（0禁用，1启用）
     * 
     */
    @ApiModelProperty(value = "状态（0禁用，1启用）")
    private Integer status;

    /**
     * 创建时间
     * 
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     * 
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}
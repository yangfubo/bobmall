package com.bob.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsRole {
    /**
     * 主键id
     * 
     */
    @ApiModelProperty(value = "主键id")
    private Integer id;

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
     * 描述
     * 
     */
    @ApiModelProperty(value = "描述")
    private String description;

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
package com.bob.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsAdmin {
    /**
     * 主键id
     * 
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 用户名
     * 
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     * 
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 手机号
     * 
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 头像
     * 
     */
    @ApiModelProperty(value = "头像")
    private String icon;

    /**
     * 邮箱
     * 
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 昵称
     * 
     */
    @ApiModelProperty(value = "昵称")
    private String nickName;

    /**
     * 备注
     * 
     */
    @ApiModelProperty(value = "备注")
    private String remark;

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
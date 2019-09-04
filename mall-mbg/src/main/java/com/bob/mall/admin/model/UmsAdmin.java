package com.bob.mall.admin.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class UmsAdmin {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 头像
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "头像")
    private String icon;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "昵称")
    private String nickName;

    /**
     * 备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 状态（0禁用，1启用）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态（0禁用，1启用）")
    private Integer status;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
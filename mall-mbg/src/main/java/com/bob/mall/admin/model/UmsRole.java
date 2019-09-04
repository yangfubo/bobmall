package com.bob.mall.admin.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class UmsRole {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "编码")
    private String code;

    /**
     * 描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "描述")
    private String description;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
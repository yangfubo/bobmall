package com.bob.mall.admin.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class UmsPermission {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 父权限id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "父权限id")
    private Integer pid;

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
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    /**
     * uri路径
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "uri路径")
    private String uri;

    /**
     * 排序
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
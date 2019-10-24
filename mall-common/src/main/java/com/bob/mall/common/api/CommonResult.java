package com.bob.mall.common.api;

import java.io.Serializable;

/**
 * 通用返回对象
 *
 * @author yangfubo
 */
public class CommonResult<T> implements Serializable{
    /**
     * 是否成功
     */
    private boolean success = true;
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回信息说明
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonResult<T> success(T data){
        this.code = ResultCodeMsg.SUCCESS.getCode();
        this.msg = ResultCodeMsg.SUCCESS.getMsg();
        this.data = data;
        return this;
    }

    public CommonResult<T> failed(String msg){
        this.success = false;
        this.code = ResultCodeMsg.FAILED.getCode();
        this.msg = msg;
        return this;
    }

    public CommonResult<T> failed(int code, String msg){
        this.success = false;
        this.code = code;
        this.msg = msg;
        return this;
    }

    /**
     *
     * @see ResultCodeMsg
     */
    public CommonResult<T> failed(CodeMsg codeMsg){
        this.success = false;
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

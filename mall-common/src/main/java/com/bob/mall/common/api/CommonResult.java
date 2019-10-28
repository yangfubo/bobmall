package com.bob.mall.common.api;

import com.bob.mall.common.constants.ResultConstants;

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
    private int code = ResultConstants.SUCCESS_CODE;
    /**
     * 返回信息说明
     */
    private String msg = ResultConstants.SUCCESS_MSG;
    /**
     * 数据
     */
    private T data;

    public CommonResult() {
    }

    public CommonResult(boolean success){
        this.success = success;
    }

    public  CommonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public  CommonResult(boolean success, int code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonResult(boolean success,CodeMsg codeMsg,T data) {
        this.success = success;
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
        this.data = data;
    }

    public CommonResult(T data) {
        this.code = ResultCodeMsg.SUCCESS.getCode();
        this.msg = ResultCodeMsg.SUCCESS.getMsg();
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data){
        return new CommonResult(data);
    }

    public static <T> CommonResult<T> failed(String msg){
        return new CommonResult(false,ResultCodeMsg.FAILED.getCode(),msg,null);
    }

    public static <T> CommonResult<T> failed(int code, String msg){
      return  new CommonResult(false,code,msg,null);
    }

    /**
     *
     * @see ResultCodeMsg
     */
    public static <T> CommonResult<T> failed(CodeMsg codeMsg){
        return new CommonResult(false,codeMsg,null);
    }


    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCodeMsg.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(false,ResultCodeMsg.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(false,ResultCodeMsg.FORBIDDEN.getCode(), ResultCodeMsg.FORBIDDEN.getMsg(), data);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(false,ResultCodeMsg.UNAUTHORIZED.getCode(), ResultCodeMsg.UNAUTHORIZED.getMsg(), data);
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

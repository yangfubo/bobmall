package com.bob.mall.common.api;

import com.bob.mall.common.constants.ResultConstants;

/**
 * 封装API的结果编码
 *
 * @author yangfubo
 */
public enum ResultCodeMsg implements CodeMsg {

    SUCCESS(200, ResultConstants.SUCCESS_MSG),
    FAILED(500, ResultConstants.SYSTEM_EXCEPTION_MSG),
    VALIDATE_FAILED(400, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    /**
     * 编码
     */
    private int code;

    /**
     * 信息
     */
    private String msg;


    ResultCodeMsg(int code, String msg){
        this.code = code;
        this.msg = msg;
    }


    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

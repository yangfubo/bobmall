package com.bob.mall.common.exception;

import com.bob.mall.common.api.CodeMsg;
import com.bob.mall.common.api.ResultCodeMsg;
/**
 * 自定义异常
 * 其他业务或分类异常继承该异常
 *
 * @author yangfubo
 */
public class SelfDefineException extends RuntimeException implements CodeMsg{

    private static final long serialVersionUID = -4672440262880747502L;

    protected static final ResultCodeMsg DEFAULT_ERROR = ResultCodeMsg.FAILED;

    protected ResultCodeMsg errorCode = DEFAULT_ERROR;

    public SelfDefineException(String msg){
        super(msg);
        errorCode.setMsg(msg);
    }

    public SelfDefineException(String msg, Throwable throwable){
        super(msg,throwable);
        errorCode.setMsg(msg);
    }

    public SelfDefineException(int code, String msg){
        super(msg);
        errorCode.setCode(code);
        errorCode.setMsg(msg);
    }

    public SelfDefineException(ResultCodeMsg resultCodeMsg){
        super(resultCodeMsg.getMsg());
        this.errorCode = resultCodeMsg;
    }

    public SelfDefineException(ResultCodeMsg resultCodeMsg, Throwable throwable){
        super(resultCodeMsg.getMsg(),throwable);
        this.errorCode = resultCodeMsg;
    }

    @Override
    public int getCode() {
        return this.errorCode.getCode();
    }

    @Override
    public String getMsg() {
        return this.errorCode.getMsg();
    }
}

package com.dep.jlp.core.util;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 14:30:47
 */

public class Result<T> {
    //成功代码
    public static final int SUCCESSFUL_CODE = 200;
    //成功消息
    public static final String SUCCESSFUL_MSG = "处理成功";

    //返回结果代码
    private Integer code;
    //返回消息
    private String msg;
    //返回值
    private T data;

    public Result() {
        super();
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * 快速返回成功结果，带返回data
     *
     * @param data 返回值
     * @return Result
     */
    public static Result success(Object data) {
        return new Result<>(SUCCESSFUL_CODE, SUCCESSFUL_MSG, data);
    }

    /**
     * 快速返回成功结果
     *
     * @return Result
     */
    public static Result success() {
        return success(null);
    }
}

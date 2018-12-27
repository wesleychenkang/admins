package com.miaoqu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by chen on 2018/12/26.
 */
@SuppressWarnings("unused")
@ApiModel(description = "返回结果")
public class ResultModel<T> {

    @ApiModelProperty("是否成功：true or false")
    private boolean result;

    @ApiModelProperty("描述性原因")
    private String message;

    @ApiModelProperty("结果状态值默认成功为0")
    private Integer state;

    @ApiModelProperty("业务数据")
    private T data;

    private ResultModel(boolean result, String message, T data, Integer state) {

        this.result = result;
        this.message = message;
        this.data = data;
        this.state = state;
    }


    public static <T> ResultModel<T> success(T data) {

        return new ResultModel<T>(true, "SUCCESS", data, 0);
    }

    public static <T> ResultModel<T> success(String message) {

        return new ResultModel<T>(true, message, null, 0);
    }

    public static <T> ResultModel<T> success(T data, String message) {

        return new ResultModel<T>(true, message, data, 0);
    }

    public static <T> ResultModel<T> failure(String message, Integer state) {

        return new ResultModel<T>(true, message, null, 0);
    }

    public static <T> ResultModel<T> failure(String message) {

        return new ResultModel<T>(true, message, null, 1);
    }

    public static <T> ResultModel<T> failure() {

        return new ResultModel<T>(true, "Failure", null, 1);
    }


    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.shop.city.common.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResult<T> {

    @JsonProperty("code")
    private int code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private T Object;

    public static RestResultBuilder SUCCESS(){
        return RestResult.builder().code(200).message("操作成功");
    }

    public static RestResultBuilder ERROR_PARAMS(){
        return RestResult.builder().code(400).message("参数错误");
    }

    public static RestResultBuilder ERROR_SERVER(){
        return RestResult.builder().code(500).message("服务器错误");
    }

    public static RestResultBuilder NOT_FOUND(){
        return RestResult.builder().code(404).message("404");
    }

    public static RestResultBuilder FORBIDDEN() {
        return RestResult.builder().code(401).message("无权限，禁止访问");
    }

    public static RestResultBuilder LOGIN() {
        return RestResult.builder().code(403).message("未登录");
    }
}

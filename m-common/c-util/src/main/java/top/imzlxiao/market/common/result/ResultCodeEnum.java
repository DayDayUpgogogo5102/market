package top.imzlxiao.market.common.result;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {
    SUCCESS(200,"成功"),
    FAIL(201,"失败"),
    LOGIN_AUTH(403,"用户未登录"),
    PERMISSION(401,"没有权限");

    private Integer code;
    private String message;



    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

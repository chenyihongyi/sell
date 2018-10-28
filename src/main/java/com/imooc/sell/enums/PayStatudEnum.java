package com.imooc.sell.enums;

import lombok.Getter;

@Getter
public enum PayStatudEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatudEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

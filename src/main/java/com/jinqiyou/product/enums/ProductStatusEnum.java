package com.jinqiyou.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"), DOWN(1, "下架");

    private final int code;
    private final String message;

    ProductStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

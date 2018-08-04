package com.jinqiyou.product.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 *
 * @param <T>
 */
@Data
public class ResultVo<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示内容
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;
}

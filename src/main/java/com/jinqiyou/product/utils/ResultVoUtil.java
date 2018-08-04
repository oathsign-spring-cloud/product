package com.jinqiyou.product.utils;

import com.jinqiyou.product.vo.ResultVo;

public class ResultVoUtil {
    public static ResultVo success(Object object) {
        ResultVo<Object> vo = new ResultVo<>();
        vo.setData(object);
        vo.setCode(0);
        vo.setMsg("成功");
        return vo;
    }
}

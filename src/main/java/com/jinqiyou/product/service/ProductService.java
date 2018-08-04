package com.jinqiyou.product.service;

import com.jinqiyou.product.beans.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();
}

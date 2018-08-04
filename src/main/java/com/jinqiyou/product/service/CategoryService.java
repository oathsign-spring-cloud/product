package com.jinqiyou.product.service;

import com.jinqiyou.product.beans.ProductCategory;

import java.util.List;

public interface CategoryService {
    List<ProductCategory> findAllByCategoryTypeIn(List<Integer> categoryType);
}

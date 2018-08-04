package com.jinqiyou.product.service.impl;

import com.jinqiyou.product.beans.ProductCategory;
import com.jinqiyou.product.dao.ProductCategoryRepository;
import com.jinqiyou.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final ProductCategoryRepository productCategoryRepository;

    public CategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public List<ProductCategory> findAllByCategoryTypeIn(List<Integer> categoryType) {
        return productCategoryRepository.findAllByCategoryTypeIn(categoryType);
    }
}

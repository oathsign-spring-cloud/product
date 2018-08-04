package com.jinqiyou.product.service;

import com.jinqiyou.product.ProductApplicationTests;
import com.jinqiyou.product.beans.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findAllByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findAllByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size() > 0);
    }
}
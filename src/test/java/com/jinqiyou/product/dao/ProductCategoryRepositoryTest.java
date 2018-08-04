package com.jinqiyou.product.dao;

import com.jinqiyou.product.ProductApplicationTests;
import com.jinqiyou.product.beans.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class ProductCategoryRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findAllByCategoryTypeIn() {
        List<ProductCategory> list = productCategoryRepository.findAllByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size() > 0);
    }
}
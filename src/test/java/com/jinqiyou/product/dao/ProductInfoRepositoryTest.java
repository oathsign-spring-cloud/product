package com.jinqiyou.product.dao;

import com.jinqiyou.product.ProductApplicationTests;
import com.jinqiyou.product.beans.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductInfoRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findAllByProductStatus() {
        List<ProductInfo> list = productInfoRepository.findAllByProductStatus(0);
        Assert.assertTrue(list.size() > 0);
    }
}
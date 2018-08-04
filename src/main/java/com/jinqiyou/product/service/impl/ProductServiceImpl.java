package com.jinqiyou.product.service.impl;

import com.jinqiyou.product.beans.ProductInfo;
import com.jinqiyou.product.dao.ProductInfoRepository;
import com.jinqiyou.product.enums.ProductStatusEnum;
import com.jinqiyou.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductInfoRepository productInfoRepository;

    public ProductServiceImpl(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findAllByProductStatus(ProductStatusEnum.UP.getCode());
    }
}

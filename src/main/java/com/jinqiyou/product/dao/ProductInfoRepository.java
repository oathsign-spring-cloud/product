package com.jinqiyou.product.dao;

import com.jinqiyou.product.beans.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findAllByProductStatus(Integer productStatus);
}

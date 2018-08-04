package com.jinqiyou.product.dao;

import com.jinqiyou.product.beans.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findAllByCategoryTypeIn(List<Integer> categoryType);
}

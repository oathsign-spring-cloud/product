package com.jinqiyou.product.controller;

import com.jinqiyou.product.beans.ProductCategory;
import com.jinqiyou.product.beans.ProductInfo;
import com.jinqiyou.product.service.CategoryService;
import com.jinqiyou.product.service.ProductService;
import com.jinqiyou.product.utils.ResultVoUtil;
import com.jinqiyou.product.vo.ProductInfoVO;
import com.jinqiyou.product.vo.ProductVO;
import com.jinqiyou.product.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/product", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    /**
     * 1.查询所有在架的商品
     * 2.获取类目type列表
     * 3.查询类目
     * 4.构造数据
     */
    @GetMapping("/list")
    public ResultVo list() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .filter(Objects::nonNull)
                .filter(num -> num != 0)
                .distinct()
                .collect(Collectors.toList());
        List<ProductCategory> categoryList = categoryService.findAllByCategoryTypeIn(categoryTypeList);
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory c : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(c.getCategoryName());
            productVO.setCategoryType(c.getCategoryType());
            List<ProductInfoVO> foods = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productVO.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    foods.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(foods);
            productVOList.add(productVO);
        }
        return ResultVoUtil.success(productVOList);
    }


}

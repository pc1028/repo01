package com.itheima.service;

import com.itheima.domain.ProductCategory;
import com.itheima.domain.ProductInfo;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer category);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

package com.itheima.service.impl;

import com.itheima.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByVategoryTypeIn() {
    }

    @Test
    public void save() {
    }
}
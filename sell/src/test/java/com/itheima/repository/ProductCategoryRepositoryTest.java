package com.itheima.repository;

import com.itheima.domain.ProductCategory;
import org.hibernate.criterion.Example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void finOne(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory);
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生专区");
        productCategory.setCategoryType(2);
        repository.save(productCategory);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
}
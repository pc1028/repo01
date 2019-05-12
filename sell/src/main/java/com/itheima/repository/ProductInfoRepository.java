package com.itheima.repository;

import com.itheima.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /**
     * 根据商品状态查询上架商品
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}

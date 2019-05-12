package com.itheima.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itheima.domain.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}

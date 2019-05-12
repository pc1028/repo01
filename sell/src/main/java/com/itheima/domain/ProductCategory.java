package com.itheima.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /** 分类id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    /** 分类名称 */
    private String categoryName;
    /** 分类编号 */
    private Integer categoryType;
}

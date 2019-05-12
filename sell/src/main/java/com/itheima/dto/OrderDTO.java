package com.itheima.dto;

import com.itheima.domain.OrderDetail;
import com.itheima.enums.OrderStatusEnum;
import com.itheima.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Data
public class OrderDTO {

    /** 订单id */
    private String orderId;
    /** 买家姓名 */
    private String buyerName;
    /** 买家电话 */
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家微信openid */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态，默认为新订单 */
    private Integer orderStatus;
    /** 支付状态，默认为等待支付 */
    private Integer payStatus;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}

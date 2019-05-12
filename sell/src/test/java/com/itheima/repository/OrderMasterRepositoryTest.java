package com.itheima.repository;

import com.itheima.domain.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {


    @Autowired
    private OrderMasterRepository repository;


    private final String OPENID="111";
    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerPhone("12345678");
        orderMaster.setBuyerAddress("深圳");
        orderMaster.setBuyerOpenid("111");
        orderMaster.setOrderAmount(new BigDecimal(3.3));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByBuyerOpenid() {
        Pageable request = new PageRequest(0,2);
        Page<OrderMaster> page = repository.findByBuyerOpenid(OPENID, request);
//        System.out.println(page.getTotalElements());
        Assert.assertNotEquals(0,page.getContent().size());
    }
}
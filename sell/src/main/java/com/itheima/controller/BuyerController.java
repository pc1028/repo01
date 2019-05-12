package com.itheima.controller;

import com.itheima.VO.ResultVO;
import com.itheima.converter.OrderForm2OrderDTOConverter;
import com.itheima.dto.OrderDTO;
import com.itheima.enums.ResultEnum;
import com.itheima.exception.SellException;
import com.itheima.form.OrderForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerController {

    //创建订单
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确，orderForm={}",orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty())
    }

    //订单列表

    //订单详情

    //取消订单
}

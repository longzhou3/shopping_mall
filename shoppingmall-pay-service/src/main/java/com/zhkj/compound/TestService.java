package com.zhkj.compound;

import com.alibaba.fastjson.JSON;
import com.zhkj.service.order_from_service.OrderFromUpdate;
import com.zhkj.vo.order_from_shop_vo.OrderFromVo;
import com.zhkj.vo.order_vo.Order_Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    @Autowired
    OrderFromUpdate orderFromUpdate;
    @GetMapping("/updateShopApi/json/{json}")
    public int updateShopApi(@PathVariable String json){
        OrderFromVo orderFromVo = JSON.parseObject(json,OrderFromVo.class);
        return orderFromUpdate.updateShopApi(orderFromVo);
    }
}

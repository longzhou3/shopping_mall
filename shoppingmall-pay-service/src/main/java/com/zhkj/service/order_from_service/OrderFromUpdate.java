package com.zhkj.service.order_from_service;

import com.zhkj.api.order_from_shop_api.OrderFromShopApi;
import com.zhkj.copy_properties.Conver_Type;
import com.zhkj.entity.OrderfromEntity;
import com.zhkj.mapper.pay_mapper.OrderFromMapper;
import com.zhkj.vo.order_from_shop_vo.OrderFromVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 支付成功后
 * 订单的修改
 */
@Service
public class OrderFromUpdate implements OrderFromShopApi {
    @Autowired
    private OrderFromMapper orderFromMapper;

    /**
     * 修改订单号
     * @param
     * @return
     */
    @Override
    public int updateShopApi(OrderFromVo orderFromVo) {
        try {
            OrderfromEntity orderfromEntity=new OrderfromEntity();
            orderfromEntity = Conver_Type.convert(orderfromEntity, orderFromVo);
            orderFromMapper.updateOrderFrom(orderfromEntity);
            System.out.println(111);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}

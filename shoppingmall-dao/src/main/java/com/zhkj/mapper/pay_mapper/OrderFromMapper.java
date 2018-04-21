package com.zhkj.mapper.pay_mapper;

import org.springframework.stereotype.Repository;

/**
 * 支付成功后订单操作
 */
@Repository
public interface OrderFromMapper {
    /**
     * 修改订单号
     * @return
     */
    public void updateOrderFrom();
}

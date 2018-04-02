package com.zhkj.api.order_api;

import com.zhkj.dto.order_dto.Order_Dto;
import com.zhkj.vo.order_vo.Order_Vo;

/**
 *数据传输业务逻辑
 */
public interface Data_Api {
    /**
     * 给前台传输数据
     * @param order_vo 返回对象
     * @return
     */
  public Order_Dto transfer_Clearing(Order_Vo order_vo);

}

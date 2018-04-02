package com.zhkj.service;

import com.zhkj.api.order_api.Data_Api;
import com.zhkj.dto.encrypt_dto.Encrypt_Returning;
import com.zhkj.dto.order_dto.Order_Dto;
import com.zhkj.vo.order_vo.Order_Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 整合传输
 */
@Service
public class Data_Service implements Data_Api {
    @Autowired
    private Encrypt_Service encrypt_service;

    /**
     * 数据接收传输方
     * @param order_vo 参数对象 参考对象属性
     * @return 返回给前端页面
     */
    @Override
    public Order_Dto transfer_Clearing(Order_Vo order_vo) {
        String enctyptToString = order_vo.getEncrypt_returning().getJson_Name();
        String private_Key = order_vo.getEncrypt_returning().getPrivate_Key();
        String enctypt = order_vo.getEncrypt_returning().getEncrypt();
        Boolean boolean_Enctypt = encrypt_service.cipher_Text_Alignment(enctyptToString, private_Key, enctypt);
        if (boolean_Enctypt) {
            Order_Dto order_dto = new Order_Dto();
            order_dto.setList(order_vo.getList());
            order_dto.setStatus(1);
            order_dto.setEncrypt_returning(order_vo.getEncrypt_returning());
            return order_dto;
        } else {
            return null;
        }
    }
}

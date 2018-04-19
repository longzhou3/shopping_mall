package com.zhkj.service.sharding_jdbc_key;
import com.zhkj.entity.Orderfromshop0Entity;
import com.zhkj.mapper.pay_mapper.OrderFromShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 主键生成业务
 */
@Service
public class SimpleKeyService {
     @Autowired
    private OrderFromShopMapper orderFromShopMapper;

    /**
     * 查询最后一列id
     * @return
     */
    public int orderfromshop0Entities(){
        return orderFromShopMapper.selectAllToOrderfromshop0().get(orderFromShopMapper.selectAllToOrderfromshop0().size()-1).getId();
    }
    /**
     * 查询最后一列id
     * @return
     */
    public int orderfromshop1Entities(){
        return orderFromShopMapper.selectAllToOrderfromshop1().get(orderFromShopMapper.selectAllToOrderfromshop1().size()-1).getId();
    }

    /**
     * 生成主键
     * @return
     */
    public int getKey(){
        int i=1;
     int orderfromshop0Entities=orderfromshop0Entities();
     int orderfromshop1Entities=orderfromshop1Entities();
     if (orderfromshop0Entities>orderfromshop1Entities){
         i=orderfromshop0Entities+1;
     }else if (orderfromshop0Entities<orderfromshop1Entities){
         i= orderfromshop1Entities+1;
     }
     return i;
    }

}

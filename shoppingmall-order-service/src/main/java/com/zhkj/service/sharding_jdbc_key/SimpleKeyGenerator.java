package com.zhkj.service.sharding_jdbc_key;

import com.zhkj.entity.Orderfromshop0Entity;
import com.zhkj.entity.Orderfromshop1Entity;
import com.zhkj.mapper.pay_mapper.OrderFromShopMapper;
import com.zhkj.util.SimpleKeyUtil;
import io.shardingjdbc.core.keygen.KeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 设置key分表规则
 */
@Service
public class SimpleKeyGenerator implements KeyGenerator {
    @Override
    public Number generateKey() {

        return SimpleKeyUtil.id;
    }
}

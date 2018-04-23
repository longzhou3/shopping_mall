package com.zhkj.service.sharding_jdbc_key;

import com.zhkj.util.SimpleKeyUtil;
import io.shardingjdbc.core.keygen.KeyGenerator;
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

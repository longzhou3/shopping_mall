package com.zhkj.mapper.pay_mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2018/4/16.
 */
@Repository
public interface testPayMapper {
    public void insert(@Param("id")Integer id);
}

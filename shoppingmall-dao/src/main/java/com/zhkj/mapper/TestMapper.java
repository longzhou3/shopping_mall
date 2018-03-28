package com.zhkj.mapper;

import com.zhkj.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 这个类为测试类
 * 程序员编码可删除
 * 仅为测试 是否可以连接数据库操作
 */
@Repository
public interface TestMapper {
   List<UserEntity> findByClassesEntity();
}

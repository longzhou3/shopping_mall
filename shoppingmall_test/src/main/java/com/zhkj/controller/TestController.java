package com.zhkj.controller;

import com.zhkj.api.UserEntity;
import com.zhkj.mapper.TestMapper;
import com.zhkj.tools.TestTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *测试controller
 */
@RestController
public class TestController {
    @Autowired
    TestMapper testMapper;
          @RequestMapping("/test")
        public List<UserEntity> name(){
             return TestTools.dtoTools(testMapper.findByClassesEntity());

        }
}

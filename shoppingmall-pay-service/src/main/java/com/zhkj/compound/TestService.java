package com.zhkj.compound;

import com.zhkj.mapper.pay_mapper.testPayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/4/16.
 */
@RestController
public class TestService {
    @Autowired
    testPayMapper testPayMapper;
    @RequestMapping("/a")
        public String a(){
        for (int i=1;i<10;i++){
        testPayMapper.insert(i);}
        return "1";
    }
}

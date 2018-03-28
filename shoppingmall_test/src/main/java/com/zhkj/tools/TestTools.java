package com.zhkj.tools;

import com.zhkj.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于转换集合类型,开发人员可自己定义 到tools服务里 这仅仅是自己测试方便编写的类
 */

public class TestTools {
       //用于解决 service 不调用 dao层 的类型转换 编程人员 自行编码解决  可以写在tools的服务里
        public static List<com.zhkj.api.UserEntity> dtoTools(List<UserEntity> listUserEntity){
            List<com.zhkj.api.UserEntity> dtoClassesList=new ArrayList<com.zhkj.api.UserEntity>();
            for (int i=0;i<listUserEntity.size();i++){
                com.zhkj.api.UserEntity dtoClasses=new com.zhkj.api.UserEntity();
                dtoClasses.setId(listUserEntity.get(i).getId());
                dtoClassesList.add(dtoClasses);
            }
            return dtoClassesList;
}



}

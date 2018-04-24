package com.zhkj.service.timer;

import com.zhkj.entity.OrderfromEntity;
import com.zhkj.mapper.order_mapper.OrderFromMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *  定时修改数据库
 *  需要日志
 */
@Configuration
@Component
@EnableScheduling
public class OrderFromTimerService{
    @Autowired
    private OrderFromMapper orderFromMapper;
    public void execute() {
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S");
        String nowTime = simpleDateFormat.format(nowDate);
        List<OrderfromEntity> orderFromList = orderFromMapper.selectByNowTime(nowTime);
        orderFromList.forEach(
                s ->{
                    if(nowDate.compareTo(s.getOrderEndTime()) == 1){
                        // 记录修改状态
                        orderFromMapper.updateByOrderFromNumber(s.getOrderNumber());
                        System.out.printf("修改%s订单成功%n",s.getOrderNumber());
                    }
                }
        );
    }
}

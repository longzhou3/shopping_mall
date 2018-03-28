package com.zhkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关
 */
@SpringBootApplication
@EnableZuulProxy      //zuul服务
@EnableDiscoveryClient  //从注册中心发现服务
public class Shopping_Mall_Zuul_Application {
    public static void main(String[] args) {
        SpringApplication.run(Shopping_Mall_Zuul_Application.class,args);
    }
}

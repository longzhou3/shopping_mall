package com.zhkj.compound;

import com.alibaba.fastjson.JSON;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhkj.Shopping_Mall_Order_Service_Application;
import com.zhkj.dto.order_dto.Clearing_Dto;
import com.zhkj.dto.order_dto.HarvestaddressEntity_Dto;
import com.zhkj.dto.order_dto.OrderFrom_Dto;
import com.zhkj.dto.order_dto.Order_Dto;
import com.zhkj.result.ResultAll;
import com.zhkj.result.ResultUtils;
import com.zhkj.service.*;
import com.zhkj.vo.order_vo.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 给用户提供
 */
@RestController
public class Clearing_Controller {
    @Autowired
    private Data_Service data_service;
    @Autowired
    private Encrypt_Service encrypt_service;
    @Autowired
    private HarvestAddressService harvestAddressService;
    @Autowired
    private OrderFromService orderFromService;
    @Autowired
    DiscountService discountService;

    /**
     * 给结算页传输数据
     * localhost:8805/clearingController1/json/{"price": 3000,"list": {"name11111": "11111111111123","password": "4564"},"encrypt_returning": {"json_Name": {"name11111": "11111111111123","password": "4564"},"private_Key": 123456,"encrypt":"5D946D76A99E7D09E90C3D48FE05C132CD26662D514400057769412E8C8BE194EAB590BAC91C6C74C1977294BEF26EC12F073A873E54499B78F448B8C7AC2C4B"}}/ciphertext/{"name11111": "11111111111123","password": "4564"}
     * 测试
     * @param
     * @return
     */
    @HystrixCommand(fallbackMethod = "errorAll")
    @RequestMapping("clearingController1/json/{json}/ciphertext/{ciphertext}")
    public ResultAll Clearing_Controller1(@PathVariable("json") String json, @PathVariable("ciphertext") String ciphertext) {
        Clearing_Vo clearing_vo = JSON.parseObject(json, Clearing_Vo.class);
        return new ResultUtils<>().resultAll(1,//
                "返回成功",//
                data_service.transfer_Clearing(clearing_vo, ciphertext));
    }

    /**
     * 测试加密
     *
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("clearingController1/a/{a}/b/{b}")
    public String test(@PathVariable("a") String a, @PathVariable("b") String b) {
        return encrypt_service.encrypt(a, b);
    }


//
//    /**
//     * 给订单页传输数据
//     *
//     * @param
//     * @return
//     */
//    @RequestMapping("orderController/json/{json}/ciphertext/{ciphertext}")
//    public Order_Dto order_Controller(@PathVariable("json") String json, @PathVariable("ciphertext") String ciphertext) {
//        Order_Vo order_vo = JSON.parseObject(json, Order_Vo.class);
//        return data_service.transfer_Order(order_vo, ciphertext);
//    }

    /**
     * 添加地址
     *
     * @param json
     * @return
     */
    @HystrixCommand(fallbackMethod = "errors")
    @RequestMapping("addAddress/json/{json}")
    public ResultAll addAddress(@PathVariable("json") String json) {
        Harvestaddress_Vo harvestaddress_vo = JSON.parseObject(json, Harvestaddress_Vo.class);
        harvestAddressService.addHarvestAddress(harvestaddress_vo);
        return new ResultUtils<>().resultAll(1,//
                "添加成功",//
               null);
    }

    /**
     * {"harvestAddress": {"id": "1","harvestAddressName": "111","harvestIsDefault": "0","typeId": "1","userId": "1"}}
     * 修改地址
     *
     * @param json
     * @return
     */
    @HystrixCommand(fallbackMethod = "errors")
    @RequestMapping("updateAddress/json/{json}")
    public ResultAll updateAddress(@PathVariable("json") String json) {
        System.out.println(111);
        Harvestaddress_Vo harvestaddress_vo = JSON.parseObject(json, Harvestaddress_Vo.class);
        harvestAddressService.updateHarvestAddress(harvestaddress_vo);
        return new ResultUtils<>().resultAll(1,//
                "修改成功",//
                null);
    }

    /**
     * 查询地址
     *
     * @param json
     * @return
     */
    @HystrixCommand(fallbackMethod = "errors")
    @RequestMapping("selectAddress/json/{json}")
    public ResultAll selectAddress(@PathVariable("json") String json) {
        Harvestaddress_Vo harvestaddress_vo = JSON.parseObject(json, Harvestaddress_Vo.class);
        return new ResultUtils<>().resultAll(1,//
                "查询成功",//
                harvestAddressService.gainMyInformation(harvestaddress_vo));

    }

    /**
     * 删除地址
     * localhost:8805/removeAddress/json/{"harvestAddress":{“id”:"1","harvestAddressName":"1","harvestIsDefault":"0","typeId":"1","userId":"1"}}
     *
     * @param json
     * @return
     */
    @HystrixCommand(fallbackMethod = "errors")
    @RequestMapping("removeAddress/json/{json}")
    public ResultAll removeAddress(@PathVariable("json") String json) {
        Harvestaddress_Vo harvestaddress_vo = JSON.parseObject(json, Harvestaddress_Vo.class);
        harvestAddressService.removeHarvestAddress(harvestaddress_vo);
        return new ResultUtils<>().resultAll(1,//
                "删除地址成功",//
                null);
    }

    /**
     * 验证金钱
     *
     * @param json
     * @return
     */
    @HystrixCommand(fallbackMethod = "errors")
    @RequestMapping("discount/json/{json}")
    public ResultAll discount(@PathVariable("json") String json) {
        Discount_Vo discount_vo = JSON.parseObject(json, Discount_Vo.class);
        return new ResultUtils<>().resultAll(1,//
                "金钱验证成功",//
                discountService.calculatePrice(discount_vo));
    }

    /**
     * 查询特定用户订单
     *
     * @param json {"userId": "1"}
     * @return 特定用户的订单
     */
    @HystrixCommand(fallbackMethod = "errors")
    @RequestMapping(value = "selectOrderFrom/json/{json}", method = RequestMethod.GET)
    public ResultAll selectOrderFrom(@PathVariable("json") String json) {
        OrderFrom_Vo orderFrom_vo = JSON.parseObject(json, OrderFrom_Vo.class);
        HashMap<String, Object> map = orderFromService.selectUserOrderFrom(orderFrom_vo);
        return new ResultUtils<>().resultAll(1,//
                "查询成功",//
                map);
    }

    /**
     * 添加订单
     *
     * @param json {"commodityId": [{"feight": "0","commodityPrice": "15","commodityNumber": "2","commodityId": "1"},{"feight": "5","commodityPrice": "80","commodityNumber": "2","commodityId": "2"}],"userId": "1","orderFromPrice": "200","harvestAddressId": "1"}
     * @return 是否成功
     */
    @HystrixCommand(fallbackMethod = "errors")
    @RequestMapping(value = "additionOrderFrom/json/{json}", method = RequestMethod.GET)
    public ResultAll additionOrderFrom(@PathVariable("json") String json) {
        OrderFrom_Vo orderFrom_vo = JSON.parseObject(json, OrderFrom_Vo.class);
        boolean result = orderFromService.additionOrderFrom(orderFrom_vo);
        if (result) {
            return new ResultUtils<>().resultAll(1,//
                    "返回成功",//
                     orderFrom_vo);
        }
        return new ResultUtils<>().resultAll(-1,//
                "返回失败",//
                null);
    }

    @GetMapping("errorAll")
    public ResultAll errorAll(String a, String b) {
        ResultAll resultAll = new ResultAll();
        resultAll.setMessage("请求失败");
        resultAll.setStatus(-1);
        return resultAll;
    }
    @GetMapping("errors")
    public ResultAll errors(String a) {
        ResultAll resultAll = new ResultAll();
        resultAll.setMessage("请求失败");
        resultAll.setStatus(-1);
        return resultAll;
    }
}

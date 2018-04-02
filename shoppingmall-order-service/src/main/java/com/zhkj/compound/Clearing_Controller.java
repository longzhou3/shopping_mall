package com.zhkj.compound;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zhkj.dto.order_dto.Clearing_Dto;
import com.zhkj.dto.order_dto.HarvestaddressEntity_Dto;
import com.zhkj.dto.order_dto.Order_Dto;
import com.zhkj.service.Data_Service;
import com.zhkj.service.Encrypt_Service;
import com.zhkj.service.HarvestAddressService;
import com.zhkj.vo.order_vo.Clearing_Vo;
import com.zhkj.vo.order_vo.Harvestaddress_Vo;
import com.zhkj.vo.order_vo.Order_Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * localhost:8805/clearingController1/json/{"price": 3000,"list": {"name": "11111111111123","password": "4564"},"encrypt_returning": {"json_Name": {"name11111": "11111111111123","password": "4564"},"private_Key": 123456,"encrypt":"7DB0A3939B4E2F9F1C23EC93CDB7A37058AE110733B62E02FB272CF5C262704DADD00C7C55B00F21099037D3CAE3C5ACCB53B966BB008522E33737F44C63B4E7"}}
     * 测试
     * @param
     * @return
     */
    @RequestMapping("clearingController1/json/{json}")
    public Clearing_Dto Clearing_Controller1(@PathVariable("json")String json) {
        Clearing_Vo clearing_vo = JSON.parseObject(json,Clearing_Vo.class);

        return data_service.transfer_Clearing(clearing_vo);
    }


    @RequestMapping("clearingController1/a/{a}/b/{b}")
    public String test(@PathVariable("a") String a, @PathVariable("b") String b) {
        return encrypt_service.encrypt(a, b);
    }

    /**
     * 给结算页传输数据
     *
     * @param clearing_vo
     * @return
     */
    @RequestMapping("clearingController")
    public Clearing_Dto Clearing_Controller(Clearing_Vo clearing_vo) {
        return data_service.transfer_Clearing(clearing_vo);
    }

    /**
     * 给订单页传输数据
     *
     * @param order_vo
     * @return
     */
    @RequestMapping("orderController")
    public Order_Dto order_Controller(Order_Vo order_vo) {
        return data_service.transfer_Order(order_vo);
    }

    /**
     * 添加地址
     *
     * @param harvesaddress_vo
     * @return
     */
    @RequestMapping("addAddress")
    public int addAddress(Harvestaddress_Vo harvesaddress_vo) {
        return harvestAddressService.addHarvestAddress(harvesaddress_vo);
    }

    /**
     * 修改地址
     *
     * @param harvesaddress_vo
     * @return
     */
    @RequestMapping("updateAddress")
    public int updateAddress(Harvestaddress_Vo harvesaddress_vo) {
        return harvestAddressService.updateHarvestAddress(harvesaddress_vo);
    }

    /**
     * 查询地址
     *
     * @param harvesaddress_vo
     * @return
     */
    @RequestMapping("selectAddress")
    public List<HarvestaddressEntity_Dto> selectAddress(Harvestaddress_Vo harvesaddress_vo) {
        return harvestAddressService.gainMyInformation(harvesaddress_vo);
    }

    /**
     * 删除地址
     *
     * @param harvesaddress_vo
     * @return
     */
    @RequestMapping("removeAddress")
    public int removeAddress(Harvestaddress_Vo harvesaddress_vo) {
        return harvestAddressService.removeHarvestAddress(harvesaddress_vo);
    }
}

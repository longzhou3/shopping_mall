package com.zhkj.vo.order_vo;


import com.zhkj.dto.order_dto.HarvestaddressEntity_Dto;

/**
 * 收货地址变动所需参数
 */
public class Harvestaddress_Vo {
    /**
     * 所属用户
     */
    private Integer userId;
    /**
     * 收货地址信息
     */
    private HarvestaddressEntity_Dto harvestAddress;
    /**
     * 是否设为默认
     */
    private Boolean isDefault = false;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public HarvestaddressEntity_Dto getHarvestAddress() {
        return harvestAddress;
    }

    public void setHarvestAddress(HarvestaddressEntity_Dto harvestAddress) {
        this.harvestAddress = harvestAddress;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}

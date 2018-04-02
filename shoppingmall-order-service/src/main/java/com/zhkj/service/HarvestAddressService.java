package com.zhkj.service;


import com.zhkj.api.order_api.HarvestAddressService_Api;
import com.zhkj.copy_properties.Conver_Type;
import com.zhkj.dto.order_dto.HarvestaddressEntity_Dto;
import com.zhkj.entity.HarvestaddressEntity;
import com.zhkj.mapper.order_mapper.HarvestAddressMapper;
import com.zhkj.vo.order_vo.Harvestaddress_Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *  收货地址变动类
 *  实现接口
 *      HarvestAddressService_Api 所属 com.zhkj.api
 */
@Service
public class HarvestAddressService implements HarvestAddressService_Api {
    @Autowired
    private HarvestAddressMapper harvestAddressMapper;

    @Override
    public int updateHarvestAddress(Harvestaddress_Vo harvesaddress_vo) {
        int index = 0;
        if(judgeUserIdAndDto(harvesaddress_vo.getUserId(),harvesaddress_vo.getHarvestAddress())){
            HarvestaddressEntity harvestaddressEntity = new HarvestaddressEntity();
            harvestaddressEntity = Conver_Type.convert(harvestaddressEntity, harvesaddress_vo.getHarvestAddress());
            index = harvestAddressMapper.updateHarvestAddress(harvesaddress_vo.getUserId(),harvestaddressEntity);
        }
        return index;
    }

    @Override
    public int addHarvestAddress(Harvestaddress_Vo harvesaddress_vo) {
        int index = 0;
        if(judgeUserIdAndDto(harvesaddress_vo.getUserId(),harvesaddress_vo.getHarvestAddress())){
            HarvestaddressEntity harvestaddressEntity = new HarvestaddressEntity();
            harvestaddressEntity = Conver_Type.convert(harvestaddressEntity,harvesaddress_vo.getHarvestAddress());
            index = harvestAddressMapper.addHarvestAddress(harvesaddress_vo.getUserId(),harvestaddressEntity);
        }
        return index;
    }

    @Override
    public int removeHarvestAddress(Harvestaddress_Vo harvestaddress_vo) {
        int index = 0;
        if(judgeUserIdAndAddressId(harvestaddress_vo.getUserId(),harvestaddress_vo.getHarvestAddress().getId())){
            index = harvestAddressMapper.removeHarvestAddress(harvestaddress_vo.getUserId(),harvestaddress_vo.getHarvestAddress().getId());
        }
        return index;
    }

    @Override
    public int setDefaultHarvestAddress(Harvestaddress_Vo harvestaddress_vo) {
        int index = 0;
        if(judgeUserIdAndAddressId(harvestaddress_vo.getUserId(),harvestaddress_vo.getHarvestAddress().getId())){
            index = harvestAddressMapper.setDefaultHarvestAddress(harvestaddress_vo.getUserId(),harvestaddress_vo.getHarvestAddress().getId());
        }
        return index;
    }

    @Override
    public List<HarvestaddressEntity_Dto> gainMyInformation(Harvestaddress_Vo harvestaddress_vo) {
        List<HarvestaddressEntity_Dto> listEntityDto = new ArrayList<>();
        if(harvestaddress_vo.getUserId() != null && harvestaddress_vo.getUserId() > 0){
            List<HarvestaddressEntity> listEntity = harvestAddressMapper.gainMyInformation(harvestaddress_vo.getUserId());
            listEntityDto = Conver_Type.convertToList(listEntityDto,listEntity,"com.zhkj.dto.HarvestaddressEntity_Dto");
        }
        return listEntityDto;
    }

    /**
     * 判断dto或userId异常
     * @param userId 所属用户
     * @param dto 收货地址信息
     * @return 是否异常
     */
    private boolean judgeUserIdAndDto(Integer userId,HarvestaddressEntity_Dto dto){
        boolean result = false;
        if(userId != null && userId > 0){
            if(dto != null){
                result = true;
            }
        }
        return result;
    }

    /**
     * 判断userId 或 addressId 是否异常
     * @param userId 所属用户
     * @param addressId 地址id
     * @return 是否异常
     */
    private boolean judgeUserIdAndAddressId(Integer userId,Integer addressId){
        boolean result = false;
        if(userId != null && userId > 0){
            if(addressId != null && addressId > 0){
                result = true;
            }
        }
        return result;
    }
}

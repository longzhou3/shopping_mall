package com.zhkj.mapper.seek_mapper;

import com.zhkj.entity.CommodityEntity;

import java.util.List;

public interface CommdityMapper {
    CommodityEntity findByCommodityId(Long id);
    List<CommodityEntity> findByCommodityId(List<Long> ids);
}

package com.zhkj.mapper.seek_mapper;

import com.zhkj.entity.CommodityTypeRelationEntity;

import java.util.List;

public interface CommodityTypeRelationMapper {
    List<CommodityTypeRelationEntity> findByCommodityId(Long id);
    List<CommodityTypeRelationEntity> findByTypeId();
}

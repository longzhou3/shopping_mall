package com.zhkj.mapper.seek_mapper;

import com.zhkj.entity.TypeEntity;

import java.util.List;

public interface TypeMapper {
    TypeEntity findByTypeId(Long id);
    List<TypeEntity> findByTypeId(List<Long> ids);
}

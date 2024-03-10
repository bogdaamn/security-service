package com.task.securityservice.mapping;

import com.task.securityservice.dto.CityDto;
import com.task.securityservice.persistance.CityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class CityEntityMapper {

    public abstract CityEntity map(CityDto source);
}

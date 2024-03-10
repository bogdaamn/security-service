package com.task.securityservice.mapping;

import com.task.securityservice.dto.CityDto;
import com.task.securityservice.dto.CountryDto;
import com.task.securityservice.persistance.CountryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class CountryDtoMapper {

    public abstract CountryDto map(CountryEntity countryEntity, List<CityDto> cities);

    public abstract List<CountryDto> map(List<CountryEntity> source);
}

package com.task.securityservice.mapping;

import com.task.securityservice.dto.UserDto;
import com.task.securityservice.persistance.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class UserDtoMapper {

    public abstract UserDto map(UserEntity source);
}
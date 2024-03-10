package com.task.securityservice.mapping;

import com.task.securityservice.config.UserInfoDetails;
import com.task.securityservice.persistance.UserEntity;
import com.task.securityservice.type.UserRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class UserInfoDetailsMapper {

    @Mapping(target = "roles", source = "role", qualifiedByName = "mapUserRoles")
    public abstract UserInfoDetails toUserInfoDetails(UserEntity source);

    @Named("mapUserRoles")
    List<GrantedAuthority> mapUserRoles(UserRole userRole) {
        return List.of(new SimpleGrantedAuthority(userRole.name()));
    }
}
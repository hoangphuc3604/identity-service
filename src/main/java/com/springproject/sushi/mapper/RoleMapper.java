package com.springproject.sushi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.springproject.sushi.dto.request.RoleRequest;
import com.springproject.sushi.dto.response.RoleResponse;
import com.springproject.sushi.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role Role);
}

package com.springproject.sushi.mapper;

import org.mapstruct.Mapper;

import com.springproject.sushi.dto.request.PermissionRequest;
import com.springproject.sushi.dto.response.PermissionResponse;
import com.springproject.sushi.model.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}

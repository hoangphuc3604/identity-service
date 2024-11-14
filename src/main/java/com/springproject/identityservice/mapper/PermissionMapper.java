package com.springproject.identityservice.mapper;

import org.mapstruct.Mapper;

import com.springproject.identityservice.dto.request.PermissionRequest;
import com.springproject.identityservice.dto.response.PermissionResponse;
import com.springproject.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}

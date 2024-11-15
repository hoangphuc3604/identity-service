package com.springproject.sushi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.sushi.dto.request.PermissionRequest;
import com.springproject.sushi.dto.response.PermissionResponse;
import com.springproject.sushi.entity.Permission;
import com.springproject.sushi.mapper.PermissionMapper;
import com.springproject.sushi.repository.PermissionReposity;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PermissionService {
    PermissionReposity permissionReposity;
    PermissionMapper permissionMapper;

    public PermissionResponse create(PermissionRequest request) {
        Permission permission = permissionMapper.toPermission(request);
        permissionReposity.save(permission);
        return permissionMapper.toPermissionResponse(permission);
    }

    public List<PermissionResponse> getAll() {
        var permissions = permissionReposity.findAll();
        return permissions.stream().map(permissionMapper::toPermissionResponse).toList();
    }

    public void delete(String permissionName) {
        permissionReposity.deleteById(permissionName);
    }
}

package com.springproject.identityservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.identityservice.dto.request.PermissionRequest;
import com.springproject.identityservice.dto.response.PermissionResponse;
import com.springproject.identityservice.entity.Permission;
import com.springproject.identityservice.mapper.PermissionMapper;
import com.springproject.identityservice.repository.PermissionReposity;

@Service
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

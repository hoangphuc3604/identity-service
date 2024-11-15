package com.springproject.sushi.service;

import java.util.List;
import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.springproject.sushi.dto.request.RoleRequest;
import com.springproject.sushi.dto.response.RoleResponse;
import com.springproject.sushi.entity.Role;
import com.springproject.sushi.mapper.RoleMapper;
import com.springproject.sushi.repository.PermissionReposity;
import com.springproject.sushi.repository.RoleReposity;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoleService {
    RoleReposity roleReposity;
    PermissionReposity permissionReposity;
    RoleMapper roleMapper;

    public RoleResponse create(RoleRequest request) {
        Role role = roleMapper.toRole(request);

        var permissions = permissionReposity.findAllById(request.getPermissions());
        role.setPermissions(new HashSet<>(permissions));

        role = roleReposity.save(role);
        return roleMapper.toRoleResponse(role);
    }

    public List<RoleResponse> getAll() {
        var role = roleReposity.findAll();
        return role.stream().map(roleMapper::toRoleResponse).toList();
    }

    public void delete(String roleName) {
        roleReposity.deleteById(roleName);
    }
}

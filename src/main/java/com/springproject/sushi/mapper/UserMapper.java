package com.springproject.sushi.mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.springproject.sushi.dto.request.UserCreationRequest;
import com.springproject.sushi.dto.request.UserUpdateRequest;
import com.springproject.sushi.dto.response.UserResponse;
import com.springproject.sushi.model.Role;
import com.springproject.sushi.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", source = "roles", qualifiedByName = "stringSetToRoleSet")
    User toUser(UserCreationRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", source = "roles", qualifiedByName = "stringSetToRoleSet")
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", source = "roles", qualifiedByName = "roleSetToStringSet")
    UserResponse toUserResponse(User user);

    @Named("roleSetToStringSet")
    default Set<String> roleSetToStringSet(Set<Role> roles) {
        if (roles == null) {
            return null;
        }
        return roles.stream().map(Role::getName).collect(java.util.stream.Collectors.toSet());
    }

    @Named("stringSetToRoleSet")
    default Set<Role> stringSetToRoleSet(Set<String> roles) {
        if (roles == null) {
            return null;
        }
        return roles.stream().map(roleName -> {
            Role role = new Role();
            role.setName(roleName);
            return role;
        }).collect(java.util.stream.Collectors.toSet());
    }

    default Set<Role> map(Set<Role> roles) {
        return roles;
    }
}

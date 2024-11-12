package com.springproject.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.springproject.identityservice.dto.request.UserCreationRequest;
import com.springproject.identityservice.dto.request.UserUpdateRequest;
import com.springproject.identityservice.dto.response.UserResponse;
import com.springproject.identityservice.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    User toUser(UserCreationRequest request);

    @Mapping(target = "id", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

    UserResponse toUserResponse(User user);
}

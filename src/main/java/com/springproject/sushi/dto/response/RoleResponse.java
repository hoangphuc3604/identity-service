package com.springproject.sushi.dto.response;

import java.util.Set;

import com.springproject.sushi.entity.Permission;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleResponse {
    String name;
    String description;

    Set<Permission> permissions;
}

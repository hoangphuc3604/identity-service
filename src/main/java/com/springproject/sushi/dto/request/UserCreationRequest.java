package com.springproject.sushi.dto.request;

import java.util.Set;

import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserCreationRequest {

    @Size(min = 8, max = 55, message = "USERNAME_INVALID")
    String username;

    @Size(min = 8, max = 16, message = "PASSWORD_INVALID")
    String password;
    Set<String> roles;

}

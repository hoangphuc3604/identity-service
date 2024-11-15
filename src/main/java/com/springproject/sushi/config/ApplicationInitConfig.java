package com.springproject.sushi.config;

import java.util.HashSet;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springproject.sushi.entity.Permission;
import com.springproject.sushi.entity.Role;
import com.springproject.sushi.entity.User;
import com.springproject.sushi.enums.Roles;
import com.springproject.sushi.repository.RoleReposity;
import com.springproject.sushi.repository.UserRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Configuration
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class ApplicationInitConfig {

    PasswordEncoder passwordEncoder;

    @Bean
    ApplicationRunner applicationRunner(UserRepository userRepository, RoleReposity roleReposity) {
        return arg -> {
            if (roleReposity.findById(Roles.ADMIN.name()).isEmpty()) {
                Role role = Role.builder()
                        .name(Roles.ADMIN.name())
                        .description("admin")
                        .build();

                roleReposity.save(role);
                log.warn("Admin role has been created.");
            }

            if (userRepository.findByUsername("admin").isEmpty()) {
                var roles = new HashSet<Role>();
                var permissions = new HashSet<Permission>();
                Role role = Role.builder()
                        .name(Roles.ADMIN.name())
                        .description("admin")
                        .permissions(permissions)
                        .build();

                roles.add(role);

                User user = User.builder()
                        .username("admin")
                        .password(passwordEncoder.encode("admin"))
                        .roles(roles)
                        .build();

                userRepository.save(user);
                log.warn("Admin has been created with default password: admin.");
            }
        };
    }
}

package com.springproject.sushi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.sushi.model.Role;

public interface RoleReposity extends JpaRepository<Role, String> {
    Optional<Role> findByName(String name);
}

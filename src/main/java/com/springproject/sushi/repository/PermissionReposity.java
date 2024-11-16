package com.springproject.sushi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.sushi.model.Permission;

public interface PermissionReposity extends JpaRepository<Permission, String> {

}

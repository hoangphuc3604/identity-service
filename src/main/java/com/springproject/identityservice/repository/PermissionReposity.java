package com.springproject.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.identityservice.entity.Permission;

public interface PermissionReposity extends JpaRepository<Permission, String> {

}

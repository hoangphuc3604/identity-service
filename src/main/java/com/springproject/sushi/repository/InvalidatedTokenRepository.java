package com.springproject.sushi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.sushi.entity.InvalidatedToken;

public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {

}
package com.springproject.sushi.repository.database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.sushi.entity.Khuvuc;

@Repository
public interface KhuVucReposiotry extends JpaRepository<Khuvuc, Integer> {
    boolean existsByTenKhuVuc(String tenKhuVuc);

    Optional<Khuvuc> findByTenKhuVuc(String tenKhuVuc);
}

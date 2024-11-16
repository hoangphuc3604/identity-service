package com.springproject.sushi.repository.database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.sushi.entity.Chinhanh;

@Repository
public interface ChiNhanhRepository extends JpaRepository<Chinhanh, Integer> {
    boolean existsByTenChiNhanh(String tenChiNhanh);

    Optional<Chinhanh> findByTenChiNhanh(String tenChiNhanh);
}

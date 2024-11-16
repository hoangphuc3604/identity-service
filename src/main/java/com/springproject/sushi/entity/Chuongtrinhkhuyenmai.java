package com.springproject.sushi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "CHUONGTRINHKHUYENMAI")
public class Chuongtrinhkhuyenmai {
    @Id
    @Column(name = "MACHUONGTRINH", nullable = false)
    private Integer id;

    @Column(name = "CHIETKHAU", precision = 5, scale = 2)
    private BigDecimal chietkhau;

    @Column(name = "GIAMGIA", precision = 18, scale = 2)
    private BigDecimal giamgia;

    @Size(max = 100)
    @Nationalized
    @Column(name = "SANPHAMTANG", length = 100)
    private String sanphamtang;

}
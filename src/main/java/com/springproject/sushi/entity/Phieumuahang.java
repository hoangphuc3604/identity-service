package com.springproject.sushi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PHIEUMUAHANG")
public class Phieumuahang {
    @Id
    @Column(name = "MAPHIEU", nullable = false)
    private Integer id;

    @Column(name = "NGAYLAP")
    private LocalDate ngaylap;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANHANVIEN")
    private Nhanvien manhanvien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKHACHHANG")
    private Khachhang makhachhang;

}
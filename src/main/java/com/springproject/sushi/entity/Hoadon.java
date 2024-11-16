package com.springproject.sushi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "HOADON")
public class Hoadon {
    @Id
    @Column(name = "MAHOADON", nullable = false)
    private Integer id;

    @Column(name = "TONGTIEN", precision = 18, scale = 2)
    private BigDecimal tongtien;

    @Column(name = "SOTIENGIAM", precision = 18, scale = 2)
    private BigDecimal sotiengiam;

    @Column(name = "THANHTIEN", precision = 18, scale = 2)
    private BigDecimal thanhtien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAPHIEU")
    private Phieumuahang maphieu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACHUONGTRINH")
    private Chuongtrinhkhuyenmai machuongtrinh;

}
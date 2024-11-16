package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "THEKHACHHANG")
public class Thekhachhang {
    @Id
    @Column(name = "MATHE", nullable = false)
    private Integer id;

    @Column(name = "NGAYLAP")
    private LocalDate ngaylap;

    @Column(name = "NGAYHETHAN")
    private LocalDate ngayhethan;

    @Column(name = "DIEMTICHLUY")
    private Integer diemtichluy;

    @Size(max = 20)
    @Nationalized
    @Column(name = "TRANGTHAI", length = 20)
    private String trangthai;

    @Size(max = 50)
    @Nationalized
    @Column(name = "LOAITHE", length = 50)
    private String loaithe;

    @Column(name = "NGAYDATHANG")
    private LocalDate ngaydathang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKHACHHANG")
    private Khachhang makhachhang;

}
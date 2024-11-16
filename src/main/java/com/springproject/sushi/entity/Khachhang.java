package com.springproject.sushi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "KHACHHANG")
public class Khachhang {
    @Id
    @Column(name = "MAKHACHHANG", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "HOTEN", length = 100)
    private String hoten;

    @Size(max = 20)
    @Nationalized
    @Column(name = "CCCD", length = 20)
    private String cccd;

    @Size(max = 10)
    @Nationalized
    @Column(name = "GIOITINH", length = 10)
    private String gioitinh;

    @Size(max = 20)
    @Nationalized
    @Column(name = "SODIENTHOAI", length = 20)
    private String sodienthoai;

    @Size(max = 100)
    @Nationalized
    @Column(name = "EMAIL", length = 100)
    private String email;

}
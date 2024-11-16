package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "NHANVIEN")
public class Nhanvien {
    @Id
    @Column(name = "MANHANVIEN", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "HOTEN", length = 100)
    private String hoten;

    @Column(name = "NGAYSINH")
    private LocalDate ngaysinh;

    @Size(max = 10)
    @Nationalized
    @Column(name = "GIOITINH", length = 10)
    private String gioitinh;

    @Size(max = 20)
    @Nationalized
    @Column(name = "SODIENTHOAI", length = 20)
    private String sodienthoai;

    @Size(max = 200)
    @Nationalized
    @Column(name = "DIACHI", length = 200)
    private String diachi;

    @Column(name = "NGAYVAOLAM")
    private LocalDate ngayvaolam;

    @Column(name = "NGAYNGHIVIEC")
    private LocalDate ngaynghiviec;

    @Column(name = "LUONG", precision = 18, scale = 2)
    private BigDecimal luong;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MABOPHAN")
    private Bophan mabophan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACHINHANH")
    private Chinhanh machinhanh;

}
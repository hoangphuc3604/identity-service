package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "CHINHANH")
public class Chinhanh {
    @Id
    @Column(name = "MACHINHANH", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "TENCHINHANH", length = 100)
    private String tenChiNhanh;

    @Column(name = "THOIGIANMOCUA")
    private LocalTime thoigianmocua;

    @Column(name = "THOIGIANDONGCUA")
    private LocalTime thoigiandongcua;

    @Size(max = 200)
    @Nationalized
    @Column(name = "DIACHI", length = 200)
    private String diachi;

    @Size(max = 20)
    @Nationalized
    @Column(name = "SODIENTHOAI", length = 20)
    private String sodienthoai;

    @Column(name = "BAIDOXEHOI")
    private Boolean baidoxehoi;

    @Column(name = "BAIDOXEMAY")
    private Boolean baidoxemay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKHUVUC")
    private Khuvuc makhuvuc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUANLICHINHANH")
    private Nhanvien quanlichinhanh;

}
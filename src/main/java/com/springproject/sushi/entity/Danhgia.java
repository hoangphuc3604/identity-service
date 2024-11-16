package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "DANHGIA")
public class Danhgia {
    @EmbeddedId
    private DanhgiaId id;

    @MapsId("makhachhang")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAKHACHHANG", nullable = false)
    private Khachhang makhachhang;

    @MapsId("mamon")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAMON", nullable = false)
    private Monan mamon;

    @Column(name = "DIEMDANHGIA")
    private Integer diemdanhgia;

    @Size(max = 500)
    @Nationalized
    @Column(name = "NHANXET", length = 500)
    private String nhanxet;

}
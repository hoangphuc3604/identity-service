package com.springproject.sushi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CHITIETPHIEUMUAHANG")
public class Chitietphieumuahang {
    @EmbeddedId
    private ChitietphieumuahangId id;

    @MapsId("maphieu")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAPHIEU", nullable = false)
    private Phieumuahang maphieu;

    @MapsId("mamon")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAMON", nullable = false)
    private Monan mamon;

    @Column(name = "SOLUONG")
    private Integer soluong;

}
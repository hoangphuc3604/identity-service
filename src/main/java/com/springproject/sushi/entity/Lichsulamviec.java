package com.springproject.sushi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "LICHSULAMVIEC")
public class Lichsulamviec {
    @EmbeddedId
    private LichsulamviecId id;

    @MapsId("manhanvien")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MANHANVIEN", nullable = false)
    private Nhanvien manhanvien;

    @Column(name = "NGAYNGHIVIEC")
    private LocalDate ngaynghiviec;

}
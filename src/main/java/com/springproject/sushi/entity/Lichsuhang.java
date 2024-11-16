package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "LICHSUHANG")
public class Lichsuhang {
    @EmbeddedId
    private LichsuhangId id;

    @MapsId("mathe")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MATHE", nullable = false)
    private Thekhachhang mathe;

    @Size(max = 50)
    @Nationalized
    @Column(name = "LOAITHE", length = 50)
    private String loaithe;

}
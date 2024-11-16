package com.springproject.sushi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "LICHSUGIA")
public class Lichsugia {
    @EmbeddedId
    private LichsugiaId id;

    @MapsId("mamon")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAMON", nullable = false)
    private Monan mamon;

    @Column(name = "GIA", precision = 18, scale = 2)
    private BigDecimal gia;

}
package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "MONAN")
public class Monan {
    @Id
    @Column(name = "MAMON", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "TENMON", length = 100)
    private String tenmon;

    @Column(name = "GIA", precision = 18, scale = 2)
    private BigDecimal gia;

    @Column(name = "TRANGTHAIPHUCVU")
    private Boolean trangthaiphucvu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAPHANMUC")
    private Phanmuc maphanmuc;

}
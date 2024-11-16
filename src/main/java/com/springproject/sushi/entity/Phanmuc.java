package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "PHANMUC")
public class Phanmuc {
    @Id
    @Column(name = "MAPHANMUC", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "TENPHANMUC", length = 100)
    private String tenphanmuc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MATHUCDON")
    private Thucdon mathucdon;

}
package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "BOPHAN")
public class Bophan {
    @Id
    @Column(name = "MABOPHAN", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "TENBOPHAN", length = 100)
    private String tenbophan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACHINHANH")
    private Chinhanh machinhanh;

}
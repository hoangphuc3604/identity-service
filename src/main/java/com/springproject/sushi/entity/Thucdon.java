package com.springproject.sushi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "THUCDON")
public class Thucdon {
    @Id
    @Column(name = "MATHUCDON", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "TENTHUCDON", length = 100)
    private String tenthucdon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKHUVUC")
    private Khuvuc makhuvuc;

}
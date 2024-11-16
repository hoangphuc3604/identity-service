package com.springproject.sushi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "KHUVUC")
public class Khuvuc {
    @Id
    @Column(name = "MAKHUVUC", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "TENKHUVUC", length = 100)
    private String tenKhuVuc;
}
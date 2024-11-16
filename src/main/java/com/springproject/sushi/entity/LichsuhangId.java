package com.springproject.sushi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class LichsuhangId implements java.io.Serializable {
    private static final long serialVersionUID = 3202189338844796917L;
    @NotNull
    @Column(name = "MATHE", nullable = false)
    private Integer mathe;

    @NotNull
    @Column(name = "NGAYDATHANG", nullable = false)
    private LocalDate ngaydathang;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
            return false;
        LichsuhangId entity = (LichsuhangId) o;
        return Objects.equals(this.mathe, entity.mathe) &&
                Objects.equals(this.ngaydathang, entity.ngaydathang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mathe, ngaydathang);
    }

}
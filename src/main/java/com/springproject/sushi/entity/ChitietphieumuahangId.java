package com.springproject.sushi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ChitietphieumuahangId implements java.io.Serializable {
    private static final long serialVersionUID = -2050095729780723503L;
    @NotNull
    @Column(name = "MAPHIEU", nullable = false)
    private Integer maphieu;

    @NotNull
    @Column(name = "MAMON", nullable = false)
    private Integer mamon;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
            return false;
        ChitietphieumuahangId entity = (ChitietphieumuahangId) o;
        return Objects.equals(this.maphieu, entity.maphieu) &&
                Objects.equals(this.mamon, entity.mamon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maphieu, mamon);
    }

}
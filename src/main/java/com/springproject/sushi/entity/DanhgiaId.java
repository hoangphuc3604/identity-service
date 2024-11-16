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
public class DanhgiaId implements java.io.Serializable {
    private static final long serialVersionUID = -2041445680649370321L;
    @NotNull
    @Column(name = "MAKHACHHANG", nullable = false)
    private Integer makhachhang;

    @NotNull
    @Column(name = "MAMON", nullable = false)
    private Integer mamon;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
            return false;
        DanhgiaId entity = (DanhgiaId) o;
        return Objects.equals(this.mamon, entity.mamon) &&
                Objects.equals(this.makhachhang, entity.makhachhang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mamon, makhachhang);
    }

}
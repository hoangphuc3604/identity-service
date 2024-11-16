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
public class LichsugiaId implements java.io.Serializable {
    private static final long serialVersionUID = -5963567041026005494L;
    @NotNull
    @Column(name = "MAMON", nullable = false)
    private Integer mamon;

    @NotNull
    @Column(name = "NGAYCAPNHAT", nullable = false)
    private LocalDate ngaycapnhat;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
            return false;
        LichsugiaId entity = (LichsugiaId) o;
        return Objects.equals(this.ngaycapnhat, entity.ngaycapnhat) &&
                Objects.equals(this.mamon, entity.mamon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ngaycapnhat, mamon);
    }

}
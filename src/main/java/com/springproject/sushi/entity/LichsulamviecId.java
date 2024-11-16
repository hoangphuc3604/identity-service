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
public class LichsulamviecId implements java.io.Serializable {
    private static final long serialVersionUID = 685113012872365228L;
    @NotNull
    @Column(name = "MANHANVIEN", nullable = false)
    private Integer manhanvien;

    @NotNull
    @Column(name = "NGAYVAOLAM", nullable = false)
    private LocalDate ngayvaolam;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
            return false;
        LichsulamviecId entity = (LichsulamviecId) o;
        return Objects.equals(this.manhanvien, entity.manhanvien) &&
                Objects.equals(this.ngayvaolam, entity.ngayvaolam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manhanvien, ngayvaolam);
    }

}
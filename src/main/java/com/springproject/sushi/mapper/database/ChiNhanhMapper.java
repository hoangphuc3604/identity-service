package com.springproject.sushi.mapper.database;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.springproject.sushi.dto.response.database.ChiNhanhResponse;
import com.springproject.sushi.entity.Chinhanh;
import com.springproject.sushi.entity.Khuvuc;
import com.springproject.sushi.entity.Nhanvien;

@Mapper(componentModel = "spring")
public interface ChiNhanhMapper {
    ChiNhanhMapper INSTANCE = Mappers.getMapper(ChiNhanhMapper.class);

    @Mapping(source = "makhuvuc", target = "makhuvuc", qualifiedByName = "mapKhuvucToInteger")
    @Mapping(source = "quanlichinhanh", target = "quanlichinhanh", qualifiedByName = "mapNhanvienToInteger")
    ChiNhanhResponse toChiNhanhResponse(Chinhanh chinhanh);

    @Named("mapKhuvucToInteger")
    default Integer mapKhuvucToInteger(Khuvuc khuvuc) {
        return khuvuc != null ? khuvuc.getId() : null;
    }

    @Named("mapNhanvienToInteger")
    default Integer mapNhanvienToInteger(Nhanvien nhanvien) {
        return nhanvien != null ? nhanvien.getId() : null;
    }
}

package com.springproject.sushi.mapper.database;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.springproject.sushi.dto.response.database.NhanVienResponse;
import com.springproject.sushi.entity.Bophan;
import com.springproject.sushi.entity.Chinhanh;
import com.springproject.sushi.entity.Nhanvien;

@Mapper(componentModel = "spring")
public interface NhanVienMapper {
    NhanVienMapper INSTANCE = Mappers.getMapper(NhanVienMapper.class);

    @Mapping(source = "machinhanh", target = "machinhanh", qualifiedByName = "chinhanhToString")
    @Mapping(source = "mabophan", target = "mabophan", qualifiedByName = "bophanToString")
    NhanVienResponse toNhanVienResponse(Nhanvien nhanvien);

    @Named("chinhanhToString")
    default Integer chinhanhToString(Chinhanh chinhanh) {
        return chinhanh != null ? chinhanh.getId() : null;
    }

    @Named("bophanToString")
    default Integer bophanToString(Bophan bophan) {
        return bophan != null ? bophan.getId() : null;
    }
}

package com.springproject.sushi.service.database;

import org.springframework.stereotype.Service;
import java.util.List;

import com.springproject.sushi.dto.response.database.NhanVienResponse;
import com.springproject.sushi.entity.Nhanvien;
import com.springproject.sushi.exception.AppException;
import com.springproject.sushi.exception.ErrorCode;
import com.springproject.sushi.mapper.database.NhanVienMapper;
import com.springproject.sushi.repository.database.NhanVienRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NhanVienService {
    NhanVienRepository nhanVienRepository;
    NhanVienMapper nhanVienMapper;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<NhanVienResponse> getAllNhanVien() {
        List<Nhanvien> nhanviens = nhanVienRepository.findAll();
        return nhanviens.stream().map(nhanVienMapper::toNhanVienResponse).toList();
    }

    public NhanVienResponse getNhanVienByMaNhanVien(int id) {
        Nhanvien nhanvien = nhanVienRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NHANVIEN_NOT_FOUND));
        return nhanVienMapper.toNhanVienResponse(nhanvien);
    }
}

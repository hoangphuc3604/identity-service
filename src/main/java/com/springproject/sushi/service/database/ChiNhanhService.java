package com.springproject.sushi.service.database;

import org.springframework.stereotype.Service;
import java.util.List;

import com.springproject.sushi.dto.response.database.ChiNhanhResponse;
import com.springproject.sushi.entity.Chinhanh;
import com.springproject.sushi.exception.AppException;
import com.springproject.sushi.exception.ErrorCode;
import com.springproject.sushi.mapper.database.ChiNhanhMapper;
import com.springproject.sushi.repository.database.ChiNhanhRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ChiNhanhService {
    ChiNhanhRepository chiNhanhRepository;
    ChiNhanhMapper chiNhanhMapper;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<ChiNhanhResponse> getChiNhanhs() {
        return chiNhanhRepository.findAll().stream().map(chiNhanhMapper::toChiNhanhResponse).toList();
    }

    public ChiNhanhResponse getChiNhanhByMaChiNhanh(Integer maChiNhanh) {
        Chinhanh chinhanh = chiNhanhRepository.findById(maChiNhanh)
                .orElseThrow(() -> new AppException(ErrorCode.CHINHANH_NOT_FOUND));
        return chiNhanhMapper.toChiNhanhResponse(chinhanh);
    }
}

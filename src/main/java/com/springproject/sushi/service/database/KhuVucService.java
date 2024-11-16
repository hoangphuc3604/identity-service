package com.springproject.sushi.service.database;

import org.springframework.stereotype.Service;
import java.util.List;

import com.springproject.sushi.entity.Khuvuc;
import com.springproject.sushi.exception.AppException;
import com.springproject.sushi.exception.ErrorCode;
import com.springproject.sushi.repository.database.KhuVucReposiotry;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KhuVucService {
    KhuVucReposiotry khuVucReposiotry;

    public List<Khuvuc> getKhuVucs() {
        return khuVucReposiotry.findAll();
    }

    public Khuvuc getKhuVucByMaKhuVuc(String maKhuVuc) {
        return khuVucReposiotry.findByTenKhuVuc(maKhuVuc)
                .orElseThrow(() -> new AppException(ErrorCode.KHUVUC_NOT_FOUND));
    }
}

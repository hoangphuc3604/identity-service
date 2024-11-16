package com.springproject.sushi.controllers.database;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.springproject.sushi.dto.response.database.NhanVienResponse;
import com.springproject.sushi.service.database.NhanVienService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/nhanvien")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NhanVienController {
    NhanVienService nhanVienService;

    @GetMapping
    public List<NhanVienResponse> getNhanViens() {
        return nhanVienService.getAllNhanVien();
    }

    @GetMapping("/{maChiNhanh}")
    public NhanVienResponse getChiNhanhByMaChiNhanh(@RequestParam Integer maNhanVien) {
        return nhanVienService.getNhanVienByMaNhanVien(maNhanVien);
    }
}

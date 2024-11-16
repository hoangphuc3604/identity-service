package com.springproject.sushi.controllers.database;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.springproject.sushi.dto.response.database.ChiNhanhResponse;
import com.springproject.sushi.service.database.ChiNhanhService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/chinhanh")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ChiNhanhController {
    ChiNhanhService chiNhanhService;

    @GetMapping
    public List<ChiNhanhResponse> getChiNhanhs() {
        return chiNhanhService.getChiNhanhs();
    }

    @GetMapping("/{maChiNhanh}")
    public ChiNhanhResponse getChiNhanhByMaChiNhanh(@RequestParam Integer maChiNhanh) {
        return chiNhanhService.getChiNhanhByMaChiNhanh(maChiNhanh);
    }
}

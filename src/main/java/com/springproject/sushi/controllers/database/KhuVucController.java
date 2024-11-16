package com.springproject.sushi.controllers.database;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.springproject.sushi.entity.Khuvuc;
import com.springproject.sushi.service.database.KhuVucService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/khuvuc")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KhuVucController {
    KhuVucService khuVucService;

    @GetMapping
    public List<Khuvuc> getKhuVucs() {
        return khuVucService.getKhuVucs();
    }

    @GetMapping("/{maKhuVuc}")
    public Khuvuc getKhuVucByMaKhuVuc(@RequestParam String maKhuVuc) {
        return khuVucService.getKhuVucByMaKhuVuc(maKhuVuc);
    }
}

package com.springproject.sushi.dto.response.database;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ChiNhanhResponse {
    Integer id;
    String tenChiNhanh;
    String thoigianmocua;
    String thoigiandongcua;
    String diachi;
    String sodienthoai;
    Boolean baidoxehoi;
    Boolean baidoxemay;
    Integer makhuvuc;
    Integer quanlichinhanh;
}

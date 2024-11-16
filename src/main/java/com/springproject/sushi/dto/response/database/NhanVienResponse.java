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
public class NhanVienResponse {
    Integer id;
    String hoten;
    String ngaysinh;
    String gioitinh;
    String diachi;
    String sodienthoai;
    String ngayvaolam;
    String ngaynghiviec;
    String luong;
    Integer mabophan;
    Integer machinhanh;
}

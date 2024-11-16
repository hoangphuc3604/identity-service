package com.springproject.sushi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.Getter;

@Getter
public enum ErrorCode {

    USER_NOT_FOUND(404, "Không tìm thấy người dùng.", HttpStatus.NOT_FOUND),
    USER_EXISTED(409, "Tên người dùng không tồn tại.", HttpStatus.BAD_REQUEST),
    UNCATEGORIZED_ERROR(400, "Lỗi chưa xác định.", HttpStatus.INTERNAL_SERVER_ERROR),
    USERNAME_INVALID(400, "Tên người dùng phải từ 8 đến 15 ký tự.", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(400, "Mật khẩu phải từ 8 đến 16 ký tự.", HttpStatus.BAD_REQUEST),
    INVALID_KEY(999, "Mã lỗi sai.", HttpStatus.BAD_REQUEST),
    UNAUTHENTICATED(401, "Người dùng chưa xác thực.", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(403, "Bạn không có quyền truy cập.", HttpStatus.FORBIDDEN),
    KHUVUC_NOT_FOUND(404, "Khu vực không tồn tại.", HttpStatus.NOT_FOUND),
    CHINHANH_NOT_FOUND(404, "Chi nhánh không tồn tại.", HttpStatus.NOT_FOUND),
    NHANVIEN_NOT_FOUND(404, "Nhân viên không tồn tại.", HttpStatus.NOT_FOUND),
    ;

    ErrorCode(int code, String message,
            HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;
    private HttpStatusCode statusCode;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

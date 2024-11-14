package com.springproject.identityservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.Getter;

@Getter
public enum ErrorCode {

    USER_NOT_FOUND(404, "User not found.", HttpStatus.NOT_FOUND),
    USER_EXISTED(409, "Username already exists.", HttpStatus.BAD_REQUEST),
    UNCATEGORIZED_ERROR(400, "Uncategorized error.", HttpStatus.INTERNAL_SERVER_ERROR),
    USERNAME_INVALID(400, "Username must be between 8 and 55 characters.", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(400, "Password must be between 8 and 16 characters.", HttpStatus.BAD_REQUEST),
    INVALID_KEY(999, "Invalid error key.", HttpStatus.BAD_REQUEST),
    USER_NOT_EXIST(404, "User does not exist.", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(401, "Unauthenticated.", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(403, "You don't have permission.", HttpStatus.FORBIDDEN);

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
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

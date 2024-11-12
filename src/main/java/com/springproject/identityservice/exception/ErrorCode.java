package com.springproject.identityservice.exception;

public enum ErrorCode {

    USER_NOT_FOUND(404, "User not found."),
    USER_EXISTED(409, "Username already exists."),
    UNCATEGORIZED_ERROR(400, "Uncategorized error."),
    USERNAME_INVALID(400, "Username must be between 8 and 55 characters."),
    PASSWORD_INVALID(400, "Password must be between 8 and 16 characters."),
    INVALID_KEY(999, "Invalid error key."),
    USER_NOT_EXIST(404, "User does not exist."),
    UNAUTHENTICATED(401, "Unauthenticated."),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

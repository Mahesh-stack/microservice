package com.micro.product.dto;

import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime localDateTime;
    private int status;
    private String error;
    private String message;
    private String path;

    public ErrorResponse(LocalDateTime localDateTime, int status, String error, String message, String path) {
        this.localDateTime = localDateTime;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}

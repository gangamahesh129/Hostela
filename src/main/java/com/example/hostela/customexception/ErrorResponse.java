package com.example.hostela.customexception;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

public class ErrorResponse {

    private String message;
    private int status;
    private LocalDateTime localDateTime;

    public ErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
        this.localDateTime = LocalDateTime.now();
    }
}

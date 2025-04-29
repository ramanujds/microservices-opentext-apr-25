package com.opntxt.ecomapp.productservice.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(HttpStatus status, String message, String error, LocalDateTime timestamp, String path) {
}

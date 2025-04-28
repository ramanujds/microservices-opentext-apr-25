package com.opntxt.springapp.dto;

import java.time.LocalDateTime;

public record Message(int id, String message, LocalDateTime timestamp) {
}

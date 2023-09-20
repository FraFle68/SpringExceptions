package de.neuefische.springexceptionhandlingtask;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
public class ErrorMessage {
    String message;
    LocalDateTime exceptionTimestamp;
}

package ru.mikhalev.springprojects.WeatherControl.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Ivan Mikhalev
 */

@Data
@Builder
@AllArgsConstructor
public class ResponseMessage {
    private String message;
    private LocalDateTime timestamp;
}

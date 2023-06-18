package ru.mikhalev.springprojects.WeatherControl.model;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @author Ivan Mikhalev
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Measurement {
    private double value;
    private boolean isRaining;
    private Sensor sensor;
    private LocalDateTime addingTime;
}

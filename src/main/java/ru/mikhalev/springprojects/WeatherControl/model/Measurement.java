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
    private double temperature;
    private boolean raining;
    private Sensor sensor;
    private LocalDateTime addingTime;
}

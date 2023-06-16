package ru.mikhalev.springprojects.WeatherControl.model;

import lombok.*;

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
    private Sensor name;
}

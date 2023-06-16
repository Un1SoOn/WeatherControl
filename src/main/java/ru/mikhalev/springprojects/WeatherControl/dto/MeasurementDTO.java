package ru.mikhalev.springprojects.WeatherControl.dto;

import lombok.*;
import ru.mikhalev.springprojects.WeatherControl.model.Sensor;

/**
 * @author Ivan Mikhalev
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MeasurementDTO {
    private double value;
    private boolean isRaining;
    private Sensor sensor;
}

package ru.mikhalev.springprojects.WeatherControl.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * @author Ivan Mikhalev
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SensorDTO {

    @NotNull(message = "Sensor name must not be null")
    @Size(min = 3, max = 30, message = "Sensor name must be between 3 and 30 symbols")
    private String name;
}

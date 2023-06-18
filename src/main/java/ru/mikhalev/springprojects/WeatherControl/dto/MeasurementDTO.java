package ru.mikhalev.springprojects.WeatherControl.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "Value of temperature must not be null")
    @Size(min = -100, max = 100, message = "Value of temperature must be between -100 and 100")
    private double value;

    @NotNull(message = "Is raining value must be true or false")
    private boolean isRaining;

    @NotNull(message = "Entered sensor must not be null")
    private Sensor sensor;
}

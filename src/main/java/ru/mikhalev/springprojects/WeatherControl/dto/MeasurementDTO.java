package ru.mikhalev.springprojects.WeatherControl.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
    @Min(value = -100, message = "Value of temperature must be between -100 and 100")
    @Max(value = 100, message = "Value of temperature must be between -100 and 100")
    private double value;

    @NotNull(message = "Is raining value must be true or false")
    private boolean raining;

    @NotNull(message = "Entered sensor must not be null")
    private Sensor sensor;
}

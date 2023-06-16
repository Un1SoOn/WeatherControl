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

    @NotNull(message = "Название сенсора не может быть пустым")
    @Size(min = 3, max = 30, message = "Название сенсора должно быть в пределах от 3 до 30 символов")
    private String name;
}

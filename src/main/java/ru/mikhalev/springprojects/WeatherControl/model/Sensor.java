package ru.mikhalev.springprojects.WeatherControl.model;

import lombok.*;

/**
 * @author Ivan Mikhalev
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Sensor {
    private String name;
}

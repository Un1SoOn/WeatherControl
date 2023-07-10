package ru.mikhalev.springprojects.WeatherControl.util;

import org.springframework.stereotype.Component;
import ru.mikhalev.springprojects.WeatherControl.dto.MeasurementDTO;
import ru.mikhalev.springprojects.WeatherControl.model.Measurement;

import java.time.LocalDateTime;

/**
 * @author Ivan Mikhalev
 */

@Component
public class MeasurementMapper {

    public Measurement mapDtoToMeasurement(MeasurementDTO measurementDTO) {
        return Measurement.builder()
                .temperature(measurementDTO.getValue())
                .raining(measurementDTO.isRaining())
                .sensor(measurementDTO.getSensor())
                .addingTime(LocalDateTime.now())
                .build();
    }
}

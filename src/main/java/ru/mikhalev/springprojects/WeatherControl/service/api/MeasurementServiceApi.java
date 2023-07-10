package ru.mikhalev.springprojects.WeatherControl.service.api;

import org.springframework.stereotype.Service;
import ru.mikhalev.springprojects.WeatherControl.dto.MeasurementDTO;
import ru.mikhalev.springprojects.WeatherControl.model.Measurement;

import java.util.List;

/**
 * @author Ivan Mikhalev
 */

@Service
public interface MeasurementServiceApi {

    void addMeasurement(Measurement measurement);

    List<Measurement> getMeasurements();
    List<Measurement> getMeasurements(String sensorName);
    Integer getCountRainyDays();
}

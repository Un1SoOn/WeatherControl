package ru.mikhalev.springprojects.WeatherControl.service.api;

import org.springframework.stereotype.Service;
import ru.mikhalev.springprojects.WeatherControl.model.Measurement;

/**
 * @author Ivan Mikhalev
 */

@Service
public interface MeasurementServiceApi {

    void addMeasurement(Measurement measurement);
}

package ru.mikhalev.springprojects.WeatherControl.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mikhalev.springprojects.WeatherControl.model.Measurement;
import ru.mikhalev.springprojects.WeatherControl.model.Sensor;
import ru.mikhalev.springprojects.WeatherControl.service.api.MeasurementServiceApi;
import ru.mikhalev.springprojects.WeatherControl.service.api.SensorServiceApi;

import java.util.Optional;

/**
 * @author Ivan Mikhalev
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class MeasurementServiceImpl implements MeasurementServiceApi {
    @Override
    public void addMeasurement(Measurement measurement) {

    }
}

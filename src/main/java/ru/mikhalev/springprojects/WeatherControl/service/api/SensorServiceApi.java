package ru.mikhalev.springprojects.WeatherControl.service.api;

import org.springframework.stereotype.Service;
import ru.mikhalev.springprojects.WeatherControl.dto.SensorDTO;
import ru.mikhalev.springprojects.WeatherControl.model.Sensor;

import java.util.Optional;

/**
 * @author Ivan Mikhalev
 */

@Service
public interface SensorServiceApi {

    void registrationSensor(Sensor sensor);

    Optional<Sensor> getAllSensors(String sensorName);

    void checkSensorInDB(Sensor sensor);
    void checkSensorInDB(String sensorName);
}

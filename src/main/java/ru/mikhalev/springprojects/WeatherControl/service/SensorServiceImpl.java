package ru.mikhalev.springprojects.WeatherControl.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.mikhalev.springprojects.WeatherControl.model.Sensor;
import ru.mikhalev.springprojects.WeatherControl.service.api.SensorServiceApi;
import ru.mikhalev.springprojects.WeatherControl.util.exception.SensorIsAlreadyDefinedInDatabase;

import java.util.Optional;

/**
 * @author Ivan Mikhalev
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class SensorServiceImpl implements SensorServiceApi {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public void registrationSensor(Sensor sensor) {
        checkSensorInDB(sensor);

        jdbcTemplate.update("insert into sensor(name) values (?)", sensor.getName());
        log.info(String.format("Sensor with name: %s successfully added in database", sensor.getName()));
    }

    @Override
    public Optional<Sensor> getAllSensors(String sensorName) {
        return jdbcTemplate.query("select * from sensor where name=?", new Object[] {sensorName},
                new BeanPropertyRowMapper<>(Sensor.class)).stream().findAny();
    }

    public void checkSensorInDB(Sensor sensor) {
        Optional<Sensor> sensors = getAllSensors(sensor.getName());

        if(sensors.isPresent()) {
            throw new SensorIsAlreadyDefinedInDatabase();
        }
    }
}

package ru.mikhalev.springprojects.WeatherControl.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.mikhalev.springprojects.WeatherControl.model.Measurement;
import ru.mikhalev.springprojects.WeatherControl.service.api.MeasurementServiceApi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ivan Mikhalev
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class MeasurementServiceImpl implements MeasurementServiceApi {

    private final JdbcTemplate jdbcTemplate;
    @Override
    public void addMeasurement(Measurement measurement) {
        jdbcTemplate.update("insert into measurement(temperature, raining, sensor, adding_time) " +
                "values(?,?,?,?)", measurement.getTemperature(), measurement.isRaining(), measurement.getSensor().getName(), LocalDateTime.now());
    }

    @Override
    public List<Measurement> getMeasurements() {
        return new ArrayList<>(jdbcTemplate.query("select * from measurement",
                new BeanPropertyRowMapper<>(Measurement.class)));
    }

    @Override
    public List<Measurement> getMeasurements(String sensorName) {
        return new ArrayList<>(jdbcTemplate.query("select * from measurement where sensor = ?",
                new Object[] {sensorName},
                new BeanPropertyRowMapper<>(Measurement.class))).stream().findAny().stream().collect(Collectors.toList());
    }

    public Integer getCountRainyDays() {
        return jdbcTemplate.queryForObject("select count(*) from measurement where raining = true", Integer.class);
    }
}

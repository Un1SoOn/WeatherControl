package ru.mikhalev.springprojects.WeatherControl.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.springprojects.WeatherControl.controller.api.SensorControllerApi;
import ru.mikhalev.springprojects.WeatherControl.dto.SensorDTO;
import ru.mikhalev.springprojects.WeatherControl.model.Sensor;
import ru.mikhalev.springprojects.WeatherControl.service.api.SensorServiceApi;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author Ivan Mikhalev
 */

@RequestMapping("/sensors")
@Slf4j
@RequiredArgsConstructor
@RestController
public class SensorController implements SensorControllerApi {

    private final SensorServiceApi sensorServiceApi;
    @Override
    @PostMapping("/registration")
    public ResponseMessage addSensor(@RequestBody @Valid Sensor sensor, BindingResult bindingResult) {

        sensorServiceApi.registrationSensor(sensor);

        return new ResponseMessage(String.format("Sensor with name: '%s' successfully added in database",
                sensor.getName()),
                LocalDateTime.now());
    }
}

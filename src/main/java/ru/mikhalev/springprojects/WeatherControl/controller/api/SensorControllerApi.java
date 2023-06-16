package ru.mikhalev.springprojects.WeatherControl.controller.api;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.springprojects.WeatherControl.model.Sensor;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;

/**
 * @author Ivan Mikhalev
 */

@RestController
@RequestMapping("/sensors")
public interface SensorControllerApi {

    @PostMapping("/registration")
    ResponseMessage addSensor(@RequestBody @Valid Sensor sensor, BindingResult bindingResult);
}

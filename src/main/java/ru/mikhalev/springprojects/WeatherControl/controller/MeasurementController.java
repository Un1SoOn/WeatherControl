package ru.mikhalev.springprojects.WeatherControl.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.springprojects.WeatherControl.dto.MeasurementDTO;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;

import java.time.LocalDateTime;

/**
 * @author Ivan Mikhalev
 */

@RestController
@Slf4j
@RequestMapping("/measurements")
@RequiredArgsConstructor
public class MeasurementController {

    @PostMapping("/add")
    public ResponseMessage addMeasurement(@RequestBody @Valid MeasurementDTO measurement,
                                          BindingResult bindingResult) {
        log.info(measurement.toString());
        return new ResponseMessage("Measurement will be get on controller", LocalDateTime.now());
    }
}

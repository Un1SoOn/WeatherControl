package ru.mikhalev.springprojects.WeatherControl.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.mikhalev.springprojects.WeatherControl.dto.MeasurementDTO;
import ru.mikhalev.springprojects.WeatherControl.model.Measurement;
import ru.mikhalev.springprojects.WeatherControl.service.api.MeasurementServiceApi;
import ru.mikhalev.springprojects.WeatherControl.service.api.SensorServiceApi;
import ru.mikhalev.springprojects.WeatherControl.util.MeasurementMapper;
import ru.mikhalev.springprojects.WeatherControl.util.MeasurementValidator;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Ivan Mikhalev
 */

@RestController
@Slf4j
@RequestMapping("/measurements")
@RequiredArgsConstructor
public class MeasurementController {

    private final MeasurementValidator measurementValidator;
    private final MeasurementServiceApi measurementService;
    private final MeasurementMapper measurementMapper;
    private final SensorServiceApi sensorService;

    @PostMapping("/add")
    public ResponseMessage addMeasurement(@RequestBody @Valid MeasurementDTO measurementDTO,
                                          BindingResult bindingResult) {
        measurementValidator.validateRequestedMeasurement(bindingResult);
        sensorService.checkSensorInDB(measurementDTO.getSensor().getName());

        log.info(measurementDTO.toString());

        Measurement measurement = measurementMapper.mapDtoToMeasurement(measurementDTO);

        measurementService.addMeasurement(measurement);
        return new ResponseMessage("Measurement will be add in database", LocalDateTime.now());
    }
}

package ru.mikhalev.springprojects.WeatherControl.controller.api;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.springprojects.WeatherControl.dto.MeasurementDTO;
import ru.mikhalev.springprojects.WeatherControl.model.Measurement;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;

import java.util.List;

/**
 * @author Ivan Mikhalev
 */

@RestController
@RequestMapping("/measurements")
public interface MeasurementControllerApi {

    ResponseMessage addMeasurement(@RequestBody @Valid MeasurementDTO measurementDTO,
                                   BindingResult bindingResult);

    List<Measurement> getMeasurements();

    List<Measurement> getMeasurements(@RequestParam String sensorName);

    String getCountRainyDays();
}

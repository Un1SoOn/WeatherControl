package ru.mikhalev.springprojects.WeatherControl.controller.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.springprojects.WeatherControl.dto.MeasurementDTO;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;

/**
 * @author Ivan Mikhalev
 */

@RestController
@RequestMapping("/measurements")
public interface MeasurementControllerApi {

    ResponseMessage addMeasurement(@RequestBody @Valid MeasurementDTO measurementDTO,
                                   BindingResult bindingResult);
}

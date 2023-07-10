package ru.mikhalev.springprojects.WeatherControl.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import ru.mikhalev.springprojects.WeatherControl.util.exception.ErrorInRequestedMeasurement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Mikhalev
 */

@Component
@Slf4j
public class MeasurementValidator {

    public void validateRequestedMeasurement(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<FieldError> errors = bindingResult.getFieldErrors();
            List<String> errorsForUser = new ArrayList<>();

            for(FieldError error : errors) {
                String stringError = error.getField() + " - " + error.getDefaultMessage();
                log.error(stringError);
                errorsForUser.add(stringError);
            }

            throw new ErrorInRequestedMeasurement(errorsForUser);
        }
    }
}

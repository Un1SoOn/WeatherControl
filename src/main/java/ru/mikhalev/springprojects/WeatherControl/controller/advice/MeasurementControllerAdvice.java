package ru.mikhalev.springprojects.WeatherControl.controller.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;
import ru.mikhalev.springprojects.WeatherControl.util.exception.ErrorInRequestedMeasurement;
import ru.mikhalev.springprojects.WeatherControl.util.exception.SensorIsNotDefinedInDatabase;

import java.time.LocalDateTime;

/**
 * @author Ivan Mikhalev
 */

@ControllerAdvice
@Slf4j
public class MeasurementControllerAdvice {

    @ExceptionHandler(ErrorInRequestedMeasurement.class)
    public ResponseEntity<ResponseMessage> errorInRequestedMeasurement
            (ErrorInRequestedMeasurement ex) {

        ResponseMessage responseMessage = ResponseMessage.builder()
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(SensorIsNotDefinedInDatabase.class)
    public ResponseEntity<ResponseMessage> sensorIsNotDefinedInDatabase
            (SensorIsNotDefinedInDatabase ex) {

        ResponseMessage responseMessage = ResponseMessage.builder()
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
    }
}

package ru.mikhalev.springprojects.WeatherControl.controller.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import ru.mikhalev.springprojects.WeatherControl.util.ResponseMessage;
import ru.mikhalev.springprojects.WeatherControl.util.exception.SensorIsAlreadyDefinedInDatabase;

import java.time.LocalDateTime;

/**
 * @author Ivan Mikhalev
 */

@ControllerAdvice
@Slf4j
public class SensorControllerAdvice {

    @ExceptionHandler(SensorIsAlreadyDefinedInDatabase.class)
    public ResponseEntity<ResponseMessage> sensorIsAlreadyDefinedItDatabaseException
            (SensorIsAlreadyDefinedInDatabase ex) {
        log.error("Sensor with entered name already exist in database");
        ResponseMessage responseMessage = ResponseMessage.builder()
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
    }
}

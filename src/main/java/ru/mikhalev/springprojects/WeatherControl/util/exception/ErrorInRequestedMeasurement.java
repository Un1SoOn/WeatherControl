package ru.mikhalev.springprojects.WeatherControl.util.exception;


import java.util.List;

/**
 * @author Ivan Mikhalev
 */


public class ErrorInRequestedMeasurement extends RuntimeException {

    private final List<String> fieldErrors;
    @Override
    public String getMessage() {
        return "Request has errors in fields: " + fieldErrors.toString();
    }

    public ErrorInRequestedMeasurement(List<String> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }
}

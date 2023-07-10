package ru.mikhalev.springprojects.WeatherControl.util.exception;

/**
 * @author Ivan Mikhalev
 */

public class SensorIsNotDefinedInDatabase extends RuntimeException {

    @Override
    public String getMessage() {
        return "Sensor with entered name not defined in database";
    }
}

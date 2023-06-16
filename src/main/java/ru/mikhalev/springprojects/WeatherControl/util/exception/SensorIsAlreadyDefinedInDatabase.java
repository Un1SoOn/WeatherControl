package ru.mikhalev.springprojects.WeatherControl.util.exception;

/**
 * @author Ivan Mikhalev
 */

public class SensorIsAlreadyDefinedInDatabase extends RuntimeException{
    @Override
    public String getMessage() {
        return "Error! Sensor with this name already added in database";
    }
}

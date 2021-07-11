package com.language.programming.model;

import com.language.programming.model.enumerations.WeatherType;

public class WeatherApp extends Observable {

    private WeatherType currentWeather;

    public WeatherApp() {
        this.setCurrentWeather(WeatherType.SUNNY);
    }

    public WeatherType getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(WeatherType currentWeather) {
        this.currentWeather = currentWeather;
    }

    public void change(WeatherType newWeather) {
        setCurrentWeather(newWeather);
        notifyObservers();
    }

    @Override
    public String toString() {
        return currentWeather.toString();
    }

}

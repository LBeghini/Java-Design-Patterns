package com.language.programming.model;

import java.util.ArrayList;
import java.util.List;

import com.language.programming.model.enumerations.DeviceType;

public class Device implements Observer {

    private DeviceType deviceType;
    private List<String> log;

    public Device(DeviceType deviceType) {
        this.deviceType = deviceType;
        this.log = new ArrayList<>();
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public List<String> getLog() {
        return this.log;
    }

    public void subscribe(WeatherApp weatherApp) {
        weatherApp.addObserver(this);
    }

    @Override
    public void update(Observable observable) {
        WeatherApp weatherApp = (WeatherApp) observable;
        log.add(weatherApp.getCurrentWeather().name() + " " + weatherApp.getCurrentWeather().toString());
        System.out.println("NOTIFICATION AT " + this.deviceType.name() + " " + this.deviceType.toString() + "\n"
                + weatherApp.getCurrentWeather().toString() + " The weather is " + weatherApp.getCurrentWeather().name()
                + " today.\n");
    }

}

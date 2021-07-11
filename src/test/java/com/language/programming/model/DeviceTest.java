package com.language.programming.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.enumerations.DeviceType;
import com.language.programming.model.enumerations.WeatherType;

public class DeviceTest {

    @Test
    public void shouldSendOneDeviceNotification() {
        WeatherApp weatherApp = new WeatherApp();
        Device device = new Device(DeviceType.SMARTPHONE);

        device.subscribe(weatherApp);

        weatherApp.change(WeatherType.CLOUDY);

        assertEquals("CLOUDY ☁️", device.getLog().get(0));
    }

    @Test
    public void shouldSendAllDeviceNotification() {
        WeatherApp weather = new WeatherApp();

        Device device1 = new Device(DeviceType.COMPUTER);
        Device device2 = new Device(DeviceType.SMARTPHONE);
        Device device3 = new Device(DeviceType.NOTEBOOK);

        device1.subscribe(weather);
        device2.subscribe(weather);
        device3.subscribe(weather);

        weather.change(WeatherType.RAINY);

        assertAll("Logs", () -> Assertions.assertEquals("RAINY 🌧️", device1.getLog().get(0)),
                () -> Assertions.assertEquals("RAINY 🌧️", device2.getLog().get(0)),
                () -> Assertions.assertEquals("RAINY 🌧️", device3.getLog().get(0)));

    }

    @Test
    public void shouldNotNotifyDevice() {
        WeatherApp weather = new WeatherApp();

        Device device = new Device(DeviceType.COMPUTER);

        weather.change(WeatherType.SUNNY);

        assertEquals(0, device.getLog().size());

    }

}

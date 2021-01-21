package com.company;

public class Main {

    public static void main(String[] args) {
        UI ui = new UI("UI");
        WeatherStatus weatherStatus1 = new WeatherStatus(23, 56);
        WeatherStatus weatherStatus2 = new WeatherStatus(29, 33);
        weatherStatus1.add(ui);
        weatherStatus1.notifyChange();
        weatherStatus2.add(ui);
        weatherStatus2.notifyChange();
    }
}

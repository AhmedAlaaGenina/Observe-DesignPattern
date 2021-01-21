package com.company;

import java.util.ArrayList;
import java.util.List;

public class WeatherStatus implements Weather {
    private float temp;
    private float press;
    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setPress(float press) {
        this.press = press;
    }

    public float getTemp() {
        return temp;
    }

    public float getPress() {
        return press;
    }

    public WeatherStatus(float temp, float press) {
        this.temp = temp;
        this.press = press;
    }

    private List<Observer> observers = new ArrayList<Observer>();


    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyChange( ) {
        float temp = getTemp();
        float press = getPress();
        for (Observer observer : observers) {
            observer.update(temp, press);
        }
    }


}

package com.company;

public class UI implements Observer {
    String name;

    public UI(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp, float press) {
        System.out.println(temp);
        System.out.println(press);
    }
}

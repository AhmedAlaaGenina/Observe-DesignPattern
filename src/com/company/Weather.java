package com.company;

public interface Weather {
     void add(Observer observer);
     void remove(Observer observer);
     void notifyChange();
}

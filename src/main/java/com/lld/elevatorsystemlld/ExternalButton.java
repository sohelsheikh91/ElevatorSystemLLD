package com.lld.elevatorsystemlld;

import java.util.List;

public class ExternalButton {

    ExternalDispatcher externalDispatcher = new ExternalDispatcher();

    public void pressButton(int destination, ElevatorCar car){
        externalDispatcher.submitRequest(destination, car);
    }
}

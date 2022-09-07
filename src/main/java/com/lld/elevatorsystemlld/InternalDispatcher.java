package com.lld.elevatorsystemlld;

import java.util.List;

public class InternalDispatcher {

    List<ElevatorController> elevatorControllerList = ElevatorCreator.getControllerList();
    public void submitRequest(int destination, ElevatorCar elevatorCar) {

    }
}
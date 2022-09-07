package com.lld.elevatorsystemlld;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {

    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {
        ElevatorCar elevatorCar = new ElevatorCar();
        elevatorCar.id = 1;
        ElevatorController elevatorController = new ElevatorController(elevatorCar);

        elevatorControllerList.add(elevatorController);
    }

    public static List<ElevatorController> getControllerList() {

        return elevatorControllerList;
    }
}

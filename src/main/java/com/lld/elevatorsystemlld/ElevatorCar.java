package com.lld.elevatorsystemlld;

import lombok.Data;

@Data
public class ElevatorCar {

    Integer id;
    ElevatorDisplay elevatorDisplay;
    InternalButton internalButton;
    ElevatorState elevatorState;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar() {
        this.id = id;
        this.elevatorDisplay = new ElevatorDisplay();
        this.internalButton = new InternalButton();
        this.elevatorState = ElevatorState.IDLE;
        this.currentFloor = 1;
        this.elevatorDirection = Direction.UP;
        this.elevatorDoor = new ElevatorDoor();
    }
    public void showSDisplay(){
        elevatorDisplay.showDisplay();
    }
    boolean moveElevator(Direction dir, int destinationFloor){
        return false;
    }
}

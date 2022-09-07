package com.lld.elevatorsystemlld;

import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> minQue;
    PriorityQueue<Integer> maxQue;
    ElevatorCar car;

    ElevatorController(ElevatorCar elevatorCar){
        this.car = elevatorCar;
        minQue = new PriorityQueue<>();
        maxQue = new PriorityQueue<>((a,b)-> b-a);
    }
    public void s
}

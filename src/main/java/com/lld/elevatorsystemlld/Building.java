package com.lld.elevatorsystemlld;

import lombok.Data;

import java.util.List;


@Data
public class Building {

    List<Floor> floorList;

    public Building(List<Floor> floorList) {

        this.floorList = floorList;
    }


}

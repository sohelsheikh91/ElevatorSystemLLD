package com.lld.elevatorsystemlld;

public class Floor {
    Integer id;
    ExternalButton externalButton;

    public Floor(int id) {
        this.id = id;
        externalButton = new ExternalButton();
    }


}

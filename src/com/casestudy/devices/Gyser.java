package com.casestudy.devices;

import com.casestudy.interfaces.WashRoomDevice;

public class Gyser extends Device implements WashRoomDevice{
    public Gyser(int id, boolean status) {
        super(id, "Gyser", status);
    }
}

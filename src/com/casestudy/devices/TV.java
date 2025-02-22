package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class TV extends Device implements BedroomDevice, LivingRoomDevice {
    public TV(int id, boolean status) {
        super(id, "TV", status);
    }
}

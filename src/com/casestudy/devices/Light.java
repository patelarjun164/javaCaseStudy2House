package com.casestudy.devices;

import com.casestudy.interfaces.*;

public class Light extends Device implements KitchenDevice, WashRoomDevice, CorridorDevice, BedroomDevice, LivingRoomDevice {
    public Light(int id, boolean status) {
        super(id, "Light", status);
    }

    @Override
    public void accessThisDevice() {

    }
}

package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.CorridorDevice;
import com.casestudy.interfaces.KitchenDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class AC extends Device implements BedroomDevice, CorridorDevice, LivingRoomDevice, KitchenDevice{
    public AC(int id, boolean status) {
        super(id, "AC", status);
    }
}

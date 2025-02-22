package com.casestudy.devices;

import com.casestudy.interfaces.KitchenDevice;

public class Refrigerator extends Device implements KitchenDevice {
    public Refrigerator(int id, boolean status) {
        super(id, "Refrigerator", status);
    }
}

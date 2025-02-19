package com.casestudy.home;

import com.casestudy.interfaces.KitchenDevice;

public class Kitchen extends Room implements KitchenDevice {
    public Kitchen() {
        this.setName("Kitchen");
    }
}

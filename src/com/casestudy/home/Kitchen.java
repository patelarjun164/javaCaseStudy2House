package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.devices.Gyser;
import com.casestudy.devices.Refrigerator;
import com.casestudy.interfaces.KitchenDevice;

import java.util.ArrayList;
import java.util.List;

public class Kitchen extends Room implements KitchenDevice {
    private List<Device> devices = new ArrayList<>();

    public Kitchen() {
        this.setName("Kitchen");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof KitchenDevice) {
            this.devices.add(device);
        } else {
            System.out.println("Device mismatch error: " + device.getClass().getSimpleName() + " is not a BedroomDevice.");
        }
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "devices=" + devices +
                '}';
    }
}

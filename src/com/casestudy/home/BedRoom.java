package com.casestudy.home;

import com.casestudy.devices.AC;
import com.casestudy.devices.Device;
import com.casestudy.devices.Light;
import com.casestudy.devices.TV;
import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.KitchenDevice;

import java.util.ArrayList;
import java.util.List;

public class BedRoom extends Room implements BedroomDevice {
    private List<Device> devices = new ArrayList<Device>();

    public BedRoom() {
        this.setName("Bedroom");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof BedroomDevice) {
            this.devices.add(device);
        } else {
            System.out.println("Device mismatch error: " + device.getClass().getSimpleName() + " is not a BedroomDevice.");
        }
    }

    @Override
    public String toString() {
        return "BedRoom{" +
                "devices=" + devices +
                '}';
    }
}

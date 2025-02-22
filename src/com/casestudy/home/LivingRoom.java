package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.KitchenDevice;
import com.casestudy.interfaces.LivingRoomDevice;

import java.util.ArrayList;
import java.util.List;

public class LivingRoom extends Room{
    private List<Device> devices = new ArrayList<Device>();

    public LivingRoom() {
        this.setName("Living Room");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof LivingRoomDevice) {
            this.devices.add(device);
        } else {
            System.out.println("Device mismatch error: " + device.getClass().getSimpleName() + " is not a BedroomDevice.");
        }
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "devices=" + devices +
                '}';
    }
}

package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.WashRoomDevice;

import java.util.ArrayList;
import java.util.List;

public class WashRoom extends Room{
    private List<Device> devices = new ArrayList<Device>();

    public WashRoom() {
        this.setName("Washroom");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof WashRoomDevice) {
            this.devices.add(device);
        } else {
            System.out.println("Device mismatch error: " + device.getClass().getSimpleName() + " is not a BedroomDevice.");
        }
    }

    @Override
    public ArrayList<Device> getONDevicesList() {
        ArrayList<Device> onDevices = new ArrayList<>();
        for (Device device : devices) {
            if (device.isStatus()) {
                onDevices.add(device);
            }
        }
        return onDevices;
    }

    @Override
    public ArrayList<Device> getOFFDevicesList() {
        ArrayList<Device> offDevices = new ArrayList<>();
        for (Device device : devices) {
            if (!device.isStatus()) {
                offDevices.add(device);
            }
        }
        return offDevices;
    }

    @Override
    public String toString() {
        return "WashRoom{" +
                "devices=" + devices +
                '}';
    }
}

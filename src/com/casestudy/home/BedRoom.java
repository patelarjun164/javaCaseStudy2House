package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.BedroomDevice;

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
        return "BedRoom{" +
                "devices=" + devices +
                '}';
    }
}

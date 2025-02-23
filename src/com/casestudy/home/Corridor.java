package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.CorridorDevice;
import com.casestudy.interfaces.KitchenDevice;

import java.util.ArrayList;
import java.util.List;

public class Corridor extends Room{
   private  List<Device> devices = new ArrayList<Device>();

    public Corridor() {
        this.setName("Corridor");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof CorridorDevice) {
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
        return "Corridor{" +
                "devices=" + devices +
                '}';
    }
}

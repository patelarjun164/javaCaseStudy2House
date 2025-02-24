package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.exceptions.DeviceMismatch;
import com.casestudy.interfaces.KitchenDevice;

import java.util.ArrayList;
import java.util.List;

public class Kitchen extends Room implements KitchenDevice {
    private List<Device> devices = new ArrayList<>();

    public Kitchen() {
        this.setName("Kitchen");
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void addDevice(Device device) throws DeviceMismatch {
        if (device instanceof KitchenDevice) {
            this.devices.add(device);
            this.setNoOfDevices(this.getNoOfDevices()+1);
        } else {
            throw new DeviceMismatch("Device mismatch error: " + device.getName() + " can not be added to " + this.getName());
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
        return "Kitchen{" +
                "devices=" + devices +
                '}';
    }
}

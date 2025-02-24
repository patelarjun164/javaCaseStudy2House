package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.exceptions.DeviceMismatch;
import com.casestudy.interfaces.BedroomDevice;

import java.util.ArrayList;
import java.util.List;

public class BedRoom extends Room implements BedroomDevice {
    private List<Device> devices = new ArrayList<Device>();

    public BedRoom() {
        this.setName("Bedroom");
    }

    @Override
    public void addDevice(Device device) throws DeviceMismatch {
        if (device instanceof BedroomDevice) {
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

    @Override
    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}

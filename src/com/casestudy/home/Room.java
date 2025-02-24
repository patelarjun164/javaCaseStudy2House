package com.casestudy.home;

import com.casestudy.devices.AC;
import com.casestudy.devices.Device;
import com.casestudy.exceptions.DeviceMismatch;

import java.util.ArrayList;
import java.util.List;

abstract public class Room {
    private int roomNo =0;
    public static int count = 1;
    private String name;
    private int noOfDevices;
    private int noOfONDevices;
    private int noOfOFFDevices;


    public Room() {
        roomNo = count++;
    }

    public int assignRoomNo(){
        return ++roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfDevices() {
        return noOfDevices;
    }

    public void setNoOfDevices(int noOfDevices) {
        this.noOfDevices = noOfDevices;
    }

    public int getNoOfONDevices() {
        return noOfONDevices;
    }

    public void setNoOfONDevices(int noOfONDevices) {
        this.noOfONDevices = noOfONDevices;
    }

    public int getNoOfOFFDevices() {
        return noOfOFFDevices;
    }

    public void setNoOfOFFDevices(int noOfOFFDevices) {
        this.noOfOFFDevices = noOfOFFDevices;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    abstract public void addDevice(Device device) throws DeviceMismatch;
    abstract public ArrayList<Device> getONDevicesList();
    abstract public ArrayList<Device> getOFFDevicesList();
    abstract public List<Device> getDevices();



    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", noOfDevices=" + noOfDevices +
                ", noOfONDevices=" + noOfONDevices +
                ", noOfOFFDevices=" + noOfOFFDevices +
                '}' + "\n";
    }

}

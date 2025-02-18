package com.casestudy.home;

public class Room {
    private String name;
    private int noOfDevices;
    private int noOfONDevices;
    private int noOfOFFDevices;


    public Room(String name, int noOfDevices, int noOfONDevices, int noOfOFFDevices) {
        this.name = name;
        this.noOfDevices = noOfDevices;
        this.noOfONDevices = noOfONDevices;
        this.noOfOFFDevices = noOfOFFDevices;
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

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", noOfDevices=" + noOfDevices +
                ", noOfONDevices=" + noOfONDevices +
                ", noOfOFFDevices=" + noOfOFFDevices +
                '}';
    }
}

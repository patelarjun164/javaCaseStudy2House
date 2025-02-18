package com.casestudy.home;

import java.util.ArrayList;

public class House {
    private ArrayList<Room> rooms = new ArrayList<>();

    public House() {
        rooms.add(new Kitchen("Kitchen",5,3,2));
        rooms.add(new BedRoom("BedRoom",2,1,1));
        rooms.add(new WashRoom("WashRoom",4,3,1));
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                '}';
    }
}

package com.casestudy.home;

import java.util.ArrayList;

public class House {
    private ArrayList<Room> rooms = new ArrayList<>();

    public House() {
        rooms.add(new Kitchen());
        rooms.add(new BedRoom());
        rooms.add(new WashRoom());
        rooms.add(new Corridor());
        rooms.add(new LivingRoom());
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

package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.exceptions.DeviceMismatch;

import java.util.ArrayList;
import java.util.Scanner;

public class House {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Room> rooms = new ArrayList<>();

    public House() {
        rooms.add(new Kitchen());
        rooms.add(new BedRoom());
        rooms.add(new WashRoom());
        rooms.add(new LivingRoom());
        rooms.add(new Corridor());
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom() {
        while (true) {
            System.out.println("\nSelect Room Type:");
            System.out.println("1. Kitchen");
            System.out.println("2. Bedroom");
            System.out.println("3. Living Room");
            System.out.println("4. Washroom");
            System.out.println("5. Corridor");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            int typeChoice = sc.nextInt();

            switch (typeChoice) {
                case 1 -> {
                    Kitchen selectedRoom = new Kitchen();
                    rooms.add(selectedRoom);
                    System.out.println(selectedRoom.getName() + " added to house successfully");
                }
                case 2 -> {
                    BedRoom selectedRoom = new BedRoom();
                    rooms.add(selectedRoom);
                    System.out.println(selectedRoom.getName() + " added to house successfully");
                }
                case 3 -> {
                    LivingRoom selectedRoom = new LivingRoom();
                    rooms.add(selectedRoom);
                    System.out.println(selectedRoom.getName() + " added to house successfully");
                }
                case 4 -> {
                    WashRoom selectedRoom = new WashRoom();
                    rooms.add(selectedRoom);
                    System.out.println(selectedRoom.getName() + " added to house successfully");
                }
                case 5 -> {
                    Corridor selectedRoom = new Corridor();
                    rooms.add(selectedRoom);
                    System.out.println(selectedRoom.getName() + " added to house successfully");
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public void addDeviceToRoom() {
        while (true) {
            System.out.println("\nSelect Room to Add Device:");
            for (int i = 0; i < rooms.size(); i++) {
                System.out.println((i + 1) + ". " + this.getRooms().get(i).getName());
            }
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            int roomChoice = sc.nextInt();

            if (roomChoice == 0) return;
            if (roomChoice < 1 || roomChoice > rooms.size()) {
                System.out.println("Invalid choice! Please try again.");
                return;
            }

            Room selectedRoom = rooms.get(roomChoice - 1);
            selectedRoom.addDeviceToRoom();
        }
    }

//    public void addDevice() throws DeviceMismatch {
//
//
//        while (true) {
//            System.out.println("\nAdding device to " + selectedRoom.getName() + "...");
//            Device newDevice = Device.selectDevice(); // Assuming Device.selectDevice() gets user input
//            try {
//                selectedRoom.addDevice(newDevice);
//                System.out.println(selectedRoom);
//            } catch (DeviceMismatch dme) {
//                System.out.println(dme.getMessage());
//            }
//
//            System.out.println("Press 1 to add another device, or 0 to go back.");
//            int next = sc.nextInt();
//            if (next == 0) break;
//        }
//    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                '}';
    }
}

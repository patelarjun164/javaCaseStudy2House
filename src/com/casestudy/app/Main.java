package com.casestudy.app;

import com.casestudy.devices.Device;
import com.casestudy.home.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static House house = new House();

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add Room");
            System.out.println("2. Add Device");
            System.out.println("3. Display All Devices");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addRoom();
                case 2 -> addDevice();
                case 3 -> displayDevices();
                case 0 -> {
                    System.out.println("Exiting the application...");
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addRoom() {
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
                case 1 -> house.addRoom(new Kitchen());
                case 2 -> house.addRoom(new BedRoom());
                case 3 -> house.addRoom(new LivingRoom());
                case 4 -> house.addRoom(new WashRoom());
                case 5 -> house.addRoom(new Corridor());
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addDevice() {
        while (true) {
            if (house.getRooms().isEmpty()) {
                System.out.println("No rooms available! Please add a room first.");
                return;
            }

            System.out.println("\nSelect Room to Add Device:");
            for (int i = 0; i < house.getRooms().size(); i++) {
                System.out.println((i + 1) + ". " + house.getRooms().get(i).getName());
            }
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            int roomChoice = sc.nextInt();

            if (roomChoice == 0) return;
            if (roomChoice < 1 || roomChoice > house.getRooms().size()) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            Room selectedRoom = house.getRooms().get(roomChoice - 1);
            while (true) {
                System.out.println("\nAdding device to " + selectedRoom.getName() + "...");
                Device newDevice = Device.selectDevice(); // Assuming Device.selectDevice() gets user input
                selectedRoom.addDevice(newDevice);
                System.out.println(selectedRoom);
//                System.out.println("Device added successfully!");

                System.out.println("Press 1 to add another device, or 0 to go back.");
                int next = sc.nextInt();
                if (next == 0) break;
            }
        }
    }

    private static void displayDevices() {
        while (true) {
            if (house.getRooms().isEmpty()) {
                System.out.println("No rooms available! Please add a room first.");
                return;
            }

            System.out.println("\nSelect Room to View Devices:");
            for (int i = 0; i < house.getRooms().size(); i++) {
                System.out.println((i + 1) + ". " + house.getRooms().get(i).getName());
            }
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            int roomChoice = sc.nextInt();

            if (roomChoice == 0) return;
            if (roomChoice < 1 || roomChoice > house.getRooms().size()) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            Room selectedRoom = house.getRooms().get(roomChoice - 1);
            System.out.println("Devices in " + selectedRoom.getName() + ": " + selectedRoom);
        }
    }
}

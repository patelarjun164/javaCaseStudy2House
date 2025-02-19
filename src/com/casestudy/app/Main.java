package com.casestudy.app;

import com.casestudy.home.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        House house = new House();
        int sizeOfRooms = house.getRooms().size();
        System.out.println(sizeOfRooms);
        ArrayList<Room> temp = house.getRooms();
//        for (int i = 0; i < sizeOfRooms; i++) {
//            house.getRooms().get(i).setNoOfDevices(3);
//        }
        System.out.println(house.getRooms());

        System.out.println("Enter 1 to add room");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Enter type of Room");
                System.out.println("Press 1 for Kitchen");
                System.out.println("Press 2 for Bedroom");
                System.out.println("Press 3 for Living Room");
                System.out.println("Press 4 for Washroom");
                System.out.println("Press 5 for Corridor");
                int typeChoice = sc.nextInt();
                switch (typeChoice) {
                    case 1 -> house.addRoom(new Kitchen());
                    case 2 -> house.addRoom(new BedRoom());
                    case 3 -> house.addRoom(new LivingRoom());
                    case 4 -> house.addRoom(new WashRoom());
                    case 5 -> house.addRoom(new Corridor());
                }

            }
            case 2 -> {
                System.out.println();
            }
            default -> System.out.println("Invalid choice! Please try again.");
        }
        System.out.println(house);
    }
}
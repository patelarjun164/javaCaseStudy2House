package com.casestudy.devices;

import com.casestudy.interfaces.*;

public class Light extends Device implements KitchenDevice, WashRoomDevice, CorridorDevice, BedroomDevice, LivingRoomDevice {
    private String color = "White";
    private String mode = "Normal";

    public Light(int id, boolean status) {
        super(id, "Light", status);
    }

    @Override
    public void accessThisDevice() {
        System.out.println("Current Color is " + this.color);
        System.out.println("Current Mode is " + this.mode);
        System.out.println("1. To turn on/off device");
        System.out.println("2. Change Color");
        System.out.println("3. Toggle Mode(Normal/RGB)");
        int controlOption = sc.nextInt();
        switch (controlOption) {
            case 1 -> {
                boolean status = this.isStatus();
                System.out.println(this.getName() + " is " + (status ? "On" : "Off") + " right Now");
                this.setStatus(!status);
                System.out.println(this.getName() + (status ? " On" : " Off") + " tha, apne " + (!status ? "On" : "Off") + " kar Diya!!!");
            }
            case 2 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                if (mode.equals("Normal")) {
                    System.out.println("Color Can not be change in Normal Mode");
                    System.out.println("Change Mode RGB to change color");
                    break;
                }

                String reset = "\033[0m";    // Reset color
                String red = "\033[31m";
                String green = "\033[32m";
                String yellow = "\033[33m";
                String blue = "\033[36m";
                System.out.println("Color is " + color);
                System.out.println("Select Color You want:");
                System.out.println("1. White");
                System.out.println("2. Red");
                System.out.println("3. Green");
                System.out.println("4. Yellow");
                System.out.println("5. Blue");
                int colorChoice = sc.nextInt();
                if (colorChoice == 1) color = "White";
                else if (colorChoice == 2) color = red + "Red" + reset;
                else if (colorChoice == 3) color = green + "Green" + reset;
                else if (colorChoice == 4) color = yellow +"Yellow" + reset;
                else if (colorChoice == 5) color = blue +"Blue" + reset;

                System.out.println("Color Changed to " + color);
            }
            case 3 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Current mode is " + mode);
                if (mode.equals("Normal"))
                    mode = "RGB";
                else mode = "Normal";
                System.out.println("Now, Mode is changed to " + (mode.equals("Normal") ? "Normal" : "RGB"));
            }
            default -> System.out.println("Invalid choice!!");
        }
    }
}

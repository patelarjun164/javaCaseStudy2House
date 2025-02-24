package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.CorridorDevice;
import com.casestudy.interfaces.KitchenDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class AC extends Device implements BedroomDevice, CorridorDevice, LivingRoomDevice, KitchenDevice {
    private int currentTemperature = 20;
    private String mode = "Cool Mode";
    public AC(int id, boolean status) {
        super(id, "AC", status);
    }

    @Override
    public void accessThisDevice() {
        System.out.println("Current Temperature is " + this.currentTemperature + " degree Celcius.");
        System.out.println("Current Mode is " + this.mode);
        System.out.println("1. To turn on/off device");
        System.out.println("2. Increase Temperature Level by 1 degree Celsius");
        System.out.println("3. Decrease Temperature Level by 1 degree Celsius");
        System.out.println("4. Set Temperature Level");
        System.out.println("5. Change Mode");
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
                System.out.println("Now, Volume level is " + ++this.currentTemperature);
            }
            case 3 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Now, Volume level is " + --this.currentTemperature);
            }
            case 4 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Enter the volume level you want:");
                currentTemperature = sc.nextInt();
                System.out.println("Now, Volume level is " + this.currentTemperature);
            }
            case 5 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Current Mode of AC is " + this.mode);
                System.out.println("Select Mode");
                System.out.println("1. Normal Mode");
                System.out.println("2. Eco Mode");
                System.out.println("3. Sleep Mode");
                System.out.println("4. Fan Cooling Mode");
                int modeChoice = sc.nextInt();
                if (modeChoice == 1) mode = "Normal Mode";
                else if (modeChoice == 2) mode = "Eco Mode";
                else if (modeChoice == 3) mode = "Sleep Mode";
                else if (modeChoice == 4) mode = "Fan Cooling Mode";
                System.out.println("AC is on " + this.mode);
            }
            default -> System.out.println("Invalid choice!!");
        }
    }
}

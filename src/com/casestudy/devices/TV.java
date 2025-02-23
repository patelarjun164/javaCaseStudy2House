package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class TV extends Device implements BedroomDevice, LivingRoomDevice {
    private int currentVolumeLevel=5;
    private int currentChannelNumber=20;
    public TV(int id, boolean status) {
        super(id, "TV", status);
        this.setStatus(false);
    }

    @Override
    public void accessThisDevice() {
        System.out.println("Current Volume level is "+ this.currentVolumeLevel);
        System.out.println("Current Channel NUmber is "+ this.currentChannelNumber);
        System.out.println("1. To turn on/off device");
        System.out.println("2. Increase Volume Level by 1 unit");
        System.out.println("3. Decrease Volume Level by 1 unit");
        System.out.println("4. Set Volume Level");
        System.out.println("5. Next Channel");
        System.out.println("6. Previous Channel");
        System.out.println("7. Set Channel Number");
        int controlOption = sc.nextInt();
        switch (controlOption){
            case 1 -> {
                boolean status = this.isStatus();
                System.out.println(this.getName()+ " is " + (status ? "On" : "Off") +" right Now");
                this.setStatus(!status);
                System.out.println(this.getName() + (status ? " On" : " Off") + " tha, apne " + (!status ? "On" : "Off") + " kar Diya!!!");
            }
            case 2 -> {
                if(!isStatus()){
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Now, Volume level is "+ ++this.currentVolumeLevel);
            }
            case 3 -> {
                if(!isStatus()){
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Now, Volume level is "+ --this.currentVolumeLevel);
            }
            case 4 -> {
                if(!isStatus()){
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Enter the volume level you want:");
                currentVolumeLevel = sc.nextInt();
                System.out.println("Now, Volume level is "+ this.currentVolumeLevel);
            }
            case 5 -> {
                if(!isStatus()){
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("You are on Channel Number "+ ++this.currentChannelNumber);
            }
            case 6 -> {
                if(!isStatus()){
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("You are on Channel Number "+ --this.currentChannelNumber);
            }
            case 7 -> {
                if(!isStatus()){
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Enter the channel Number you want to watch:");
                currentChannelNumber = sc.nextInt();
                System.out.println("You are on Channel Number "+ this.currentChannelNumber);
            }
            default -> System.out.println("Invalid choice!!");
        }
    }
}

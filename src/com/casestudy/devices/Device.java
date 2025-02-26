package com.casestudy.devices;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

abstract public class Device {
    static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private boolean status;
    private LocalDateTime previousStateTime = LocalDateTime.now();

    public Device(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static Device selectDevice(){
        System.out.println("Press 1 to add AC");
        System.out.println("Press 2 to add Gyser");
        System.out.println("Press 3 to add Light");
        System.out.println("Press 4 to add MusicPlayer");
        System.out.println("Press 5 to add Refrigerator");
        System.out.println("Press 6 to add TV");

        int deviceChoice = sc.nextInt();
        switch (deviceChoice){
            case 1 -> {
                return new AC(1, false);
            }
            case 2 -> {
                return new Gyser(1, false);
            }
            case 3 -> {
                return new Light(1, false);
            }
            case 4 -> {
                return new MusicPlayer(1, false);
            }
            case 5 -> {
                return new Refrigerator(1, false);
            }
            case 6 -> {
                return new TV(1, false);
            }
        }
        return new Light(1, false);
    }

    abstract public void accessThisDevice();

    public void getTimeSincePreviousStateChange() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(previousStateTime, currentTime);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("Device has been " + (status ? "On" : "Off") + " for: "
                + hours + " hrs, " + minutes + " mins, " + seconds + " secs.");
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.LivingRoomDevice;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer extends Device implements BedroomDevice, LivingRoomDevice {
    private int currentVolumeLevel = 5;
    private int currentTrackNumber = 1;
    private ArrayList<String> songs = new ArrayList<>(List.of(
            "Ek Phool - Priyanka Barve ,ONkarswaroop",
            "Kaakan - Shankar Mahadevan, Neha Rajpal",
            "Mitwa - Shankar Mahadevan",
            "Dhaga Dhaga - Harsh Wavre, Anandi Joshi",
            "Sar Sukhachi Shravani - Abhijeet Sawant, Bela Shende",
            "Sairat Jhala Ji - Ajay Gogawale, Chinmayee Sripada",
            "Baharla Ha Madhumas - Ajay Gogawale, Shreya Ghosal",
            "Chandra - Shreya Ghosal, Ajay-Atul",
            "Adhir Man Jhale"
    ));

    public MusicPlayer(int id, boolean status) {
        super(id, "MusicPlayer", status);
    }

    @Override
    public void accessThisDevice() {
        System.out.println("Current Volume level is " + this.currentVolumeLevel);
        System.out.println("Current Channel NUmber is " + this.currentTrackNumber);
        System.out.println("You are playing " + songs.get(currentTrackNumber));
        System.out.println("1. To turn on/off device");
        System.out.println("2. Increase Volume Level by 1 unit");
        System.out.println("3. Decrease Volume Level by 1 unit");
        System.out.println("4. Set Volume Level");
        System.out.println("5. Next Song");
        System.out.println("6. Previous Song");
        System.out.println("7. Set Song Number");
        System.out.println("8. Add Song to playlist");
        System.out.println("9. Display playlist");
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
                System.out.println("Now, Volume level is " + ++this.currentVolumeLevel);
            }
            case 3 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Now, Volume level is " + --this.currentVolumeLevel);
            }
            case 4 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Enter the volume level you want:");
                currentVolumeLevel = sc.nextInt();
                System.out.println("Now, Volume level is " + this.currentVolumeLevel);
            }
            case 5 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                if (this.currentTrackNumber == songs.size() - 1) {
                    System.out.println("You are now playing " + songs.get(0));
                    this.currentTrackNumber = 0;
                } else {
                    System.out.println("You are now playing " + songs.get(++this.currentTrackNumber));
                }
                System.out.println();
            }
            case 6 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                if (this.currentTrackNumber == 0) {
                    System.out.println("You are now playing " + songs.get(songs.size() - 1));
                    this.currentTrackNumber = songs.size() - 1;
                } else {
                    System.out.println("You are now playing " + songs.get(--this.currentTrackNumber));
                }
            }
            case 7 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Enter the Track Number you want to Listen:");
                for (int i = 0; i < songs.size(); i++) {
                    System.out.println((i+1)+ ") " + songs.get(i));
                }
                currentTrackNumber = sc.nextInt()-1;
                System.out.println("You are Playing " + songs.get(currentTrackNumber));
            }

            case 8 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Enter song name you want to add to playlist");
                sc.nextLine();
                String songName = sc.nextLine();
                songs.add(songName);
                System.out.println("Song Added Successfully...!");
            }

            case 9 -> {
                if (!isStatus()) {
                    System.out.println("First Turn on Device");
                    break;
                }
                System.out.println("Current Playlist: ");
                for (int i = 0; i < songs.size(); i++) {
                    System.out.println((i+1)+ ") " + songs.get(i));
                }
            }
            default -> System.out.println("Invalid choice!!");
        }
    }
}

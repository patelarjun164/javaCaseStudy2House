package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class MusicPlayer extends Device implements BedroomDevice, LivingRoomDevice {
    public MusicPlayer(int id, boolean status) {
        super(id, "MusicPlayer", status);
    }

    @Override
    public void accessThisDevice() {

    }
}

package com.hackbois.lan_platform;

/**
 * Created by Fresh Jesh on 2/24/2018.
 */

public class Player<T> {
    private String name_;
    private Class<T> gamePacket_;

    public Player(String name, Class<T> gamePacket){
        name_ = name;
        gamePacket_ = gamePacket;
    }

    public String getName(){
        return name_;
    }

    public Class<T> getGamePacket() {
        return gamePacket_;
    }

    public void updateGamePacket(Class<T> gamePacket){
        gamePacket_ = gamePacket;
    }
}

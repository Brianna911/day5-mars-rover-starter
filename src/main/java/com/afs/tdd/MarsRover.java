package com.afs.tdd;


import java.util.List;
import java.util.stream.Collectors;

import java.util.List;
import java.util.stream.Collectors;
// MarsRover.java
// MarsRover.java
// MarsRover.java
public class MarsRover {
    private int x;
    private int y;
    private char direction;

    public MarsRover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public char getDirection() { return direction; }
    public void turnLeft() {
        switch (direction) {
            case 'N': direction = 'W'; break;
            default: break;
        }
    }
}
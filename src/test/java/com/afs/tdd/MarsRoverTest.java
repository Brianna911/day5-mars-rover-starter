package com.afs.tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

// MarsRoverTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {
    @Test
    public void testInitialPosition() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals('N', rover.getDirection());
    }
    @Test
    public void testTurnLeftFromNorth() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.turnLeft();
        assertEquals('W', rover.getDirection());
    }
    @Test
    public void testTurnLeftFromWest() {
        MarsRover rover = new MarsRover(0, 0, 'W');
        rover.turnLeft();
        assertEquals('S', rover.getDirection());
    }
    @Test
    public void testTurnLeftFromSouth() {
        MarsRover rover = new MarsRover(0, 0, 'S');
        rover.turnLeft();
        assertEquals('E', rover.getDirection());
    }
    @Test
    public void testTurnLeftFromEast() {
        MarsRover rover = new MarsRover(0, 0, 'E');
        rover.turnLeft();
        assertEquals('N', rover.getDirection());
    }
    @Test
    public void testTurnRightFromNorth() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.turnRight();
        assertEquals('E', rover.getDirection());
    }
}
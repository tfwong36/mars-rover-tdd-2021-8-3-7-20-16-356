package com.afs.tdd;

public class MarsRover {

    private int locationX;
    private int locationY;
    private char direction;

    public MarsRover(int locationX, int locationY, char direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(char command) {
        this.locationY++;
    }

    public String getStatus() {
        return String.format("%s %s %s", this.locationX, this.locationY, this.direction);
    }
}

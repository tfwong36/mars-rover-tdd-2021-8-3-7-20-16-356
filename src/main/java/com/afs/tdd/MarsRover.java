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
        if (this.direction == 'E')
            this.locationX++;
        else if (this.direction == 'S')
            this.locationY--;
        else if (this.direction == 'W')
            this.locationX--;
        else
            this.locationY++;
    }

    public String getStatus() {
        return String.format("%s %s %s", this.locationX, this.locationY, this.direction);
    }
}

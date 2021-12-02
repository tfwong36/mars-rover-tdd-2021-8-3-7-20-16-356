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
        if (command == 'M'){
            if (this.direction == 'E')
                this.locationX++;
            else if (this.direction == 'S')
                this.locationY--;
            else if (this.direction == 'W')
                this.locationX--;
            else
                this.locationY++;
        } else if (command == 'L'){
            if (this.direction == 'N')
                this.direction = 'W';
            else if (this.direction == 'E')
                this.direction = 'N';
            else if (this.direction == 'S')
                this.direction = 'E';
        }


    }

    public String getStatus() {
        return String.format("%s %s %s", this.locationX, this.locationY, this.direction);
    }
}

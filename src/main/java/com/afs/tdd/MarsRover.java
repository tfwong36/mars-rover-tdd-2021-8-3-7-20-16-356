package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class MarsRover {

    private int locationX;
    private int locationY;
    private char direction;
    private final static String directions = "NESW";

    public MarsRover(int locationX, int locationY, char direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    private void executeCommand(char command) {
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
            int directionIndex = directions.indexOf(this.direction);
            this.direction = directions.charAt(directionIndex - 1 < 0? directionIndex - 1 + directions.length() : directionIndex - 1);
        } else if (command == 'R'){
            int directionIndex = directions.indexOf(this.direction);
            this.direction = directions.charAt(directionIndex + 1 == directions.length()? 0 : directionIndex + 1);
        }


    }

    public String getStatus() {
        return String.format("%s %s %s", this.locationX, this.locationY, this.direction);
    }

    public String executeCommands(String commands) {
        return null;
    }
}

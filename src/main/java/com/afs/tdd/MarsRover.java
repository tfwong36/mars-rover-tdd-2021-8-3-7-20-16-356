package com.afs.tdd;

public class MarsRover {

    private int locationX;
    private int locationY;
    private char direction;
    private final static String directions = "NESW";
    //define frequently use directions here


    public MarsRover(int locationX, int locationY, char direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    private void moveForward(){
        if (this.direction == 'E')
            this.locationX++;
        else if (this.direction == 'S')
            this.locationY--;
        else if (this.direction == 'W')
            this.locationX--;
        else // this.direction == 'N'
            this.locationY++;
    }

    private void turnLeft(){
        //shift to left
        int directionIndex = directions.indexOf(this.direction);
        this.direction = directions.charAt(directionIndex - 1 < 0? directionIndex - 1 + directions.length() : directionIndex - 1);
    }

    private void turnRight(){//shift to right
        int directionIndex = directions.indexOf(this.direction);
        this.direction = directions.charAt(directionIndex + 1 == directions.length()? 0 : directionIndex + 1);
    }

    private void executeCommand(char command) {
        if (command == 'M'){
            moveForward();
        } else if (command == 'L'){
            turnLeft();
        } else if (command == 'R'){
            turnRight();
        }
    }

    public String getStatus() {
        return String.format("%s %s %s", this.locationX, this.locationY, this.direction);
    }

    public void executeCommands(String commands){
        for (char command : commands.toCharArray()){
            executeCommand(command);
        }
    }
}
//rename test file name to {ClassName}Test

package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_Increment_Y_by_1_when_move_given_X0_Y0_North_Move(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        //char Command = 'M';
        String Commands = "M";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 1 N", result);
    }
    @Test
    void should_return_Increment_X_by_1_when_move_given_X0_Y0_East_Move(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'E');
        //char Command = 'M';
        String Commands = "M";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("1 0 E", result);
    }
    @Test
    void should_return_Reduce_Y_by_1_when_move_given_X0_Y0_South_Move(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'S');
        //char Command = 'M';
        String Commands = "M";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 -1 S", result);
    }
    @Test
    void should_return_Reduce_X_by_1_when_move_given_X0_Y0_West_Move(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'W');
        //char Command = 'M';
        String Commands = "M";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("-1 0 W", result);
    }
    @Test
    void should_return_Turn_West_when_given_X0_Y0_North_Turn_Left(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        //char Command = 'L';
        String Commands = "L";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 W", result);
    }

    @Test
    void should_return_Turn_North_when_given_X0_Y0_East_Turn_Left(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'E');
        //char Command = 'L';
        String Commands = "L";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 N", result);
    }

    @Test
    void should_return_Turn_East_when_given_X0_Y0_South_Turn_Left(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'S');
        //char Command = 'L';
        String Commands = "L";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 E", result);
    }
    @Test
    void should_return_Turn_South_when_given_X0_Y0_West_Turn_Left(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'W');
        //char Command = 'L';
        String Commands = "L";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 S", result);
    }
    @Test
    void should_return_Turn_East_when_given_X0_Y0_North_Turn_Right(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        //char Command = 'R';
        String Commands = "R";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 E", result);
    }
    @Test
    void should_return_Turn_South_when_given_X0_Y0_East_Turn_Right(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'E');
        //char Command = 'R';
        String Commands = "R";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 S", result);
    }
    @Test
    void should_return_Turn_West_when_given_X0_Y0_South_Turn_Right(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'S');
        //char Command = 'R';
        String Commands = "R";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 W", result);
    }
    @Test
    void should_return_Turn_North_when_given_X0_Y0_West_Turn_Right(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'W');
        //char Command = 'R';
        String Commands = "R";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 N", result);
    }
    @Test
    void should_return_X_Negative1_Y_Positive1_N_when_given_X0_Y0_North_BatchCommand(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        String Commands = "MLMR";

        //when
        marsRover.executeCommands(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("-1 1 N", result);
    }
}

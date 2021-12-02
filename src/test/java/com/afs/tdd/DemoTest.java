package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_X0_Y1_when_move_given_X0_Y0_North_Move(){
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        char Command = 'M';

        //when
        marsRover.executeCommand(Command);
        result = marsRover.getStatus();

        //then
        assertEquals("0 1 N", result);
    }
}

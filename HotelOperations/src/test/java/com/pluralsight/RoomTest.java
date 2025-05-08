package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RoomTest {
    @Test
   public void checkIn_shouldNotAllow_whenRoomIsAlreadyOccupied(){
        //arrange
        Room room = new Room(4,150,true,false);

        //act
        room.checkIn();

        //assert
        assertFalse(false);
        assertFalse(room.isDirty());
    }
    @Test
    public void checkOut_shouldMakeRoomAvailableAndDirty(){
        //Arrange
        Room room = new Room(4,150,true,false);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());  //Room should not be occupied after checkout
        assertTrue(room.isDirty());     //Room should be dirty after checkout

    }
    @Test
    public void clanRoom_shouldCleanDirtyUnoccupiedRoom(){

        //arrange
        Room room = new Room(4,150,false,true);

       //act
       room.cleanRoom();

       //assert

        assertFalse(room.isDirty());

    }

}
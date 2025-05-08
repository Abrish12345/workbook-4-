package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HotelTest {
 @Test
    public void bookRoom_should_increaseBookRooms(){
     //arrange
     Hotel newHotel = new Hotel("century",15,50);

     //act
     newHotel.bookRoom(3,true);

     //assert
     assertEquals(12, newHotel.getAvailableSuits());

 }
 @Test
 public void bookRoom_should_increaseBookedRooms(){
     //arrange

     Hotel newHotel = new Hotel("century",15,50);

     //act
     newHotel.bookRoom(3,false);

     //assert
     assertEquals(47,newHotel.getAvailableRooms());

 }


}
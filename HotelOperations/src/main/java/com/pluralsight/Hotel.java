package com.pluralsight;

public class Hotel {

        private String name;
        private int numberOfSuites;
        private int numberOfRooms;
        private int bookedSuites;
        private int bookedBasicRooms;

        //constructor that for only the number of rooms and suites

        public Hotel(String name, int numberOfSuites, int numberOfRooms) {
            this.name = name;
            this.numberOfSuites = numberOfSuites;
            this.numberOfRooms = numberOfRooms;
            this.bookedSuites = 0;
            this.bookedBasicRooms = 0;

        }

        // constructor for the number of suites, rooms, and booked rooms

        public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
            this.name = name;
            this.numberOfSuites = numberOfSuites;
            this.numberOfRooms = numberOfRooms;
            this.bookedSuites = bookedSuites;
            this.bookedBasicRooms = bookedBasicRooms;


        }

        public String getName() {
            return name;
        }

        public int getNumberOfSuites() {
            return numberOfSuites;
        }

        public int getNumberOfRooms() {
            return numberOfRooms;
        }

        public int getBookedSuites() {
            return bookedSuites;
        }

        public int getBookedBasicRooms() {
            return bookedBasicRooms;
        }
        //Methods to calculate available suit

        public int getAvailableSuits(){
            return this.getNumberOfSuites() - this.getBookedSuites();
        }
        //method to calculate available basic rooms

        public int getAvailableRooms(){
            return numberOfRooms - bookedBasicRooms;
        }

        //Method to book a room (either suite or basic room)

        public boolean bookRoom (int numberOfRooms, boolean isSuite) {
            if (isSuite) {
                //check if enough suites are available
                if(numberOfRooms <= getAvailableSuits()){
                    this.bookedSuites += numberOfRooms;
                    return true;
                }

            }else {
                if(numberOfRooms<=getAvailableRooms()) {
                    this.bookedBasicRooms += numberOfRooms;
                    return true;
                }

            }
            //if room not available
            return false;
        }
    }



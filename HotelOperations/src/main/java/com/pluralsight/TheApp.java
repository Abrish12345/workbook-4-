package com.pluralsight;


public class TheApp {
    public static void main(String[] args) {
        Room room = new Room(2, 150.00,false,false);
        System.out.println("Room available: " + room.isAvailable());

        Reservation res = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + res.getReservationTotal());

        Employee emp = new Employee(101, "Abraham", "Front Desk",20.00,45);
        System.out.println("Total Pay: $" + emp.getTotalPay());

        Employee emp1 = new Employee(102, "Eric", "manager",50,0 );
        emp1.punchIn(9);
        emp1.punchOut(13);
        emp1.punchIn(9);
        emp1.punchOut(13);
        System.out.println("Total hours: " + emp1.getHoursWorked());

        emp1.punchIn();
        emp1.punchOut();

        //create a hotel with 5 suites and 30 basic rooms
        Hotel hotel = new Hotel("gast",5,30);
        // Print initial availability
        System.out.println("Initial available suites: " + hotel.getNumberOfSuites());
        System.out.println("Initial available rooms: " + hotel.getAvailableRooms());

        // Try to book 3 suites
        boolean suitesBooked = hotel.bookRoom(3, true);
        System.out.println("Booking 3 suites: " + (suitesBooked ? "Success" : "Failed"));

        // Try to book 10 basic rooms
        boolean roomsBooked = hotel.bookRoom(10, false);
        System.out.println("Booking 10 basic rooms: " + (roomsBooked ? "Success" : "Failed"));

        // Print availability after booking
        System.out.println("Available suites after booking: " + hotel.getNumberOfSuites());
        System.out.println("Available rooms after booking: " + hotel.getAvailableRooms());

        // Try to overbook 8 more suites (only 7 left)
        boolean overbookSuites = hotel.bookRoom(8, true);
        System.out.println("Booking 8 more suites: " + (overbookSuites ? "Success" : "Failed"));

        // Try to overbook 45 more basic rooms (only 40 left)
        boolean overbookRooms = hotel.bookRoom(45, false);
        System.out.println("Booking 45 more basic rooms: " + (overbookRooms ? "Success" : "Failed"));

        // Final availability check
        System.out.println("Final available suites: " + hotel.getNumberOfSuites());
        System.out.println("Final available rooms: " + hotel.getAvailableRooms());

    }
}

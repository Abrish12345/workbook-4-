package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {
        Room room = new Room(2, 150.00,false,false);
        System.out.println("Room available: " + room.isAvailable());

        Reservation res = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + res.getReservationTotal());

        Employee emp = new Employee(101, "Abraham", "Front Desk",20.00,45);
        System.out.println("Total Pay: $" + emp.getTotalPay());

    }
}

package com.pluralsight;

public class Reservation {
    private String roomType;
    private int unmberOfNights;
    private boolean isWeenkend;

    public Reservation(String roomType, int unmberOfNights, boolean isWeenkend) {
        this.roomType = roomType;
        this.unmberOfNights = unmberOfNights;
        this.isWeenkend = isWeenkend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getUnmberOfNights() {
        return unmberOfNights;
    }

    public void setUnmberOfNights(int unmberOfNights) {
        this.unmberOfNights = unmberOfNights;
    }

    public boolean isWeenkend() {
        return isWeenkend;
    }

    public void setWeenkend(boolean weenkend) {
        isWeenkend = weenkend;
    }
    public double getPrice() {
        double basePrice = roomType.equalsIgnoreCase("king") ? 139.00 : 124.00;
        if (isWeenkend) {
            basePrice *= 1.10;
        }
        return basePrice;

    }
  public double getReservationTotal(){
        return getPrice() * unmberOfNights;
  }
}

package com.Company;

abstract class Ticket {
    private String pnr;
    private String from;
     private String to;
     private Flight flight;
     private String departureDateTime;
     private String arrivalDateTime;
     private Passenger passenger;
     private String seatNumber;
     private float price;
     private boolean cancelled;

     public Ticket() {}
    public Ticket(String pnr){
         this.pnr=pnr;
    }

public Ticket(String pnr, String from, String to, String flight, String departureDateTime, String arrivalDateTime,
              Passenger passenger, String seatNumber, float price, boolean cancelled) {
    this.pnr = pnr;
    this.to = to;
    this.from = from;
    this.departureDateTime = departureDateTime;
    this.arrivalDateTime = arrivalDateTime;
    this.passenger = passenger;
    this.seatNumber = seatNumber;
    this.price = price;
    this.cancelled = cancelled;
}

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    public String getPrintTicketDetails() {
         return pnr;
    }
}





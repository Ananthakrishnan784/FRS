package com.Company;

public class RegularTicket extends Ticket
{
private String specialServices;

public RegularTicket(String pnr, String from, String to, String flight, String departureDateTime, String arrivalDateTime,
                     Passenger passenger, String seatNumber, float price, boolean cancelled,String specialServices) {
    super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNumber,price,cancelled);
    this.specialServices = specialServices;
}

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }



}



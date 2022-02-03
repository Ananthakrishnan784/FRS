package com.Company;

public class TouristTicket extends Ticket {
public String hotelAddress;
public String selectedTouristLocation;


public TouristTicket(String pnr,  String from, String to, String flight, String departureDateTime, String arrivalDateTime,
                     Passenger passenger, String seatNumber, float price, boolean cancelled ,String hotelAddress,
                     String selectedTouristLocation) {
    super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNumber,price,cancelled);
    this.hotelAddress = hotelAddress;
    this.selectedTouristLocation = selectedTouristLocation;
}

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
    public String getPrintTicketDetails() {

        return super.getPrintTicketDetails();

    }
}


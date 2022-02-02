package com.Company;

public class TouristTicket {
public String hotelAddress;
public String selectedTouristLocation;


public TouristTicket(String hotelAddress, String selectedTouristLocation) {
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
}


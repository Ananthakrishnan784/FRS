package com.Company;

public class Main {

public static void main(String[] args) {
    Ticket regularTicket= new RegularTicket("6889","Kerala","Mysore","ABC","5:20","13:20",null,"1A",5500,
            false,"Breakfast");
    Ticket touristTicket=new TouristTicket("8789","Banglore","london","XYZ","15:20","6:20",null,"2A",
            8000,false,"Burj Khalifa","Dubai Mall");

    printTicketDetails(regularTicket);
    printTicketDetails(touristTicket);
}
public static void printTicketDetails(Ticket ticket) {
    System.out.println(ticket.getPnr());
}

}

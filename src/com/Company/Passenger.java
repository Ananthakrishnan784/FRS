package com.Company;

public class Passenger {

    private int id;
    private static int idCounter=0;

    private static class Address {
        String street;
        String city;
        String state;
        public Address(String street, String city, String State) {
            this.street=street;
            this.city=city;
            this.state=state;
        }
    }
    private Address address;

    private static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;



    public Passenger(String addressStreet, String addressCity, String addressState, String contactName, String contactPhone,String contactEmail) {

        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }



    public int getId() {
        return idCounter;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getAddress() {
        return address.street + "," + address.city + ", " + address.state;
    }

    public String getContact(){
        return contact.name+", "+contact.phone+", "+contact.email;
    }

    public int getPassengerCount() {

        return idCounter;
    }







}

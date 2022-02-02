package com.Company;

public class Contact {

    public String name;
    public String phone;
    public String email;

    public Contact(String name, String phone, String email) {
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }


}

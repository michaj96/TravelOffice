package com.academy;

public class Customer
{
    private String name;
    private Address address;
    private Trip trip;

    Customer(String givenName)
    {
        this.name = givenName;

    }

    public void setAddress(Address givenAddress)
    {
        this.address = givenAddress;

    }
    public void assignTrip(Trip givenTrip)
    {
        this.trip = givenTrip;

    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        String info = "Name: " + this.name + " Address: " + address.getInfo() + " Trip" + trip.toString();
        return info;
    }


}

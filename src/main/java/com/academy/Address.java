package com.academy;

public class Address
{
    private String street, zip,  city;

    Address(String givenStreet, String givenZip, String givenCity)
    {
        this.city = givenCity;
        this.zip = givenZip;
        this.street = givenStreet;


    }

    public String getInfo()
    {
        String info;
        info = "City: " + this.city + " Zip code: " + this.zip + " Street: " + this.street;
        return info;

    }
}

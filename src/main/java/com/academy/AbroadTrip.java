package com.academy;

public class AbroadTrip extends Trip {

    private double insurance;

    AbroadTrip(Date start, Date end, String destination) {


        super(start, end, destination);

    }

    AbroadTrip(String start, String end, String separator, String destination) {

        super (start, end, separator, destination);


    }



    @Override
    public double getPrice() {

        return super.getPrice()+insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }






}

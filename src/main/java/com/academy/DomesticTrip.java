package com.academy;

public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;



    DomesticTrip(Date start, Date end, String destination)
    {
        super(start, end, destination);
    }




    @Override
    public double getPrice() {
        return super.getPrice()-ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

}

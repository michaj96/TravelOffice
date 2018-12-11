package com.academy;

abstract public class Trip
{
    private Date start;
    private Date end;
    private String destination;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    Trip (Date start, Date end, String destination)
    {
         this.start = start;
         this.end = end;
         this.destination = destination;


    }

    Trip (String start, String end, String separator, String destination)
    {
        String[] partsStart = start.split(separator);
        Date parsedStart = new Date(Integer.valueOf(partsStart[0]),Integer.valueOf(partsStart[1]),Integer.valueOf(partsStart[2]));
        this.start=parsedStart;

        String[] partsEnd = end.split(separator);
        Date parsedEnd = new Date(Integer.valueOf(partsEnd[0]),Integer.valueOf(partsEnd[1]),Integer.valueOf(partsEnd[2]));
        this.end=parsedEnd;

        this.destination = destination;



    }
    public String toString()
    {
        String info;
        info = "Start: " + start.toString() + " End: " + end.toString() + " Destination " + this.destination + " Price: " + this.price;

        return info;
    }


}

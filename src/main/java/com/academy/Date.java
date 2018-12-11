package com.academy;

public class Date
{
    private int day;
    private int month;
    private int year;

    public static Date parser(String toParse, String separator)
    {

        String[] parts = toParse.split(separator);
        Date parsed = new Date(Integer.valueOf(parts[0]),Integer.valueOf(parts[1]),Integer.valueOf(parts[2]));


        return parsed;

    }

    Date (int d, int m, int y)
    {
        day = d;
        month = m;
        year  = y;

    }
    public String toString()
    {
        String info;
        info = day + "." + month +"."+ year;
        return info;
    }

}

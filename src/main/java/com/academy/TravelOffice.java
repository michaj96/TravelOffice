package com.academy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {
    public static int CustomerNumber = 1;
    public static Set<Customer> CustomerSet = new HashSet<>();

    Map<String, Trip> map = new HashMap<>();

    public static void addCustomer(Customer givenCustomer){


        CustomerSet.add(givenCustomer);
        CustomerNumber++;


    }


    public static int getCustomerCount(){
        int counter;
        counter = CustomerSet.size();
        return counter;




    }

    void addTrip(String givenString, Trip givenTrip){
        map.put(givenString, givenTrip);

    }

    boolean removeTrip(String givenString){

        int size =  map.size();
        map.remove(givenString);

        if (size != map.size())
        {

            return true;
        }
        else
        {
            return false;
        }



    }

    Customer findCustomerByName(String givenName)
    {

        for (Customer x: CustomerSet) {
            if (x.getName().equals(givenName))
            {
                return x;
            }




        }

        return null;


    }

    Map<String, Trip> returnAllTrips(){
        return map;

    }

    Set<Customer> returnAllCustomers(){
        return CustomerSet;
    }



    boolean removeCustomer(Customer givenCustomer)
    {

        int size =  CustomerSet.size();
        CustomerSet.remove(givenCustomer);

        if (size != CustomerSet.size())
        {
            return true;
        }
        else
        {
            return false;
        }




    }



    public String toString(){
        String listOfCustomers ="";
        for (Customer i: CustomerSet)
              {
                  listOfCustomers += i.toString() + "\n";
        }
        return listOfCustomers;



    }
}

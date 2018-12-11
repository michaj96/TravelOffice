package com.academy;

public class Test {

    public static void main(String[] args)
    {

        TravelOffice TO = new TravelOffice();






        Date StartAlaska = Date.parser("21.03.2019","\\.");
        Date EndAlaska = new Date (30, 3, 2019);

        Date StartWarszawa = new Date (27,9,2019);
        Date EndWarszawa = new Date (5, 10, 2019);

        Date StartLondon= new Date (5,4,2019);
        Date EndLondon = new Date (11, 4, 2019);


//ALASKA TRIP
        //Trip Alaska = new Trip(StartAlaska,EndAlaska,"Alaska");
        Trip Alaska = new AbroadTrip("21.09.2020","30.09.2020","\\.","Alaska");
        Alaska.setPrice(400);
//NEW TRIP DOMESTIC
        DomesticTrip Warszawa = new DomesticTrip(StartWarszawa,EndWarszawa,"Warszawa");
        Warszawa.setPrice(400);
        Warszawa.setOwnArrivalDiscount(200);


//NEW TRIP ABROAD
        AbroadTrip London = new AbroadTrip("21.03.2019","28.03.2019","\\.","London");
        //AbroadTrip London = new AbroadTrip(StartLondon,EndLondon,"London");
        London.setPrice(200);
        London.setInsurance(1000);
//JASON
        Customer Jason = new Customer("Jason");
        Address Legnicka = new Address ("Legnicka","94-234", "Lodz");

        Jason.assignTrip(Alaska);
        Jason.setAddress(Legnicka);


//MIKE
        Customer Mike = new Customer("Mike");
        Address Lanowa = new Address ("Lanowa","91-103", "Lodz");
        Mike.assignTrip(Alaska);
        Mike.setAddress(Lanowa);


//PAT
        Customer Pat = new Customer("Pat");
        Address Lodowa = new Address ("Lodowa","95-134", "Warszawa");
        Pat.assignTrip(Alaska);
        Pat.setAddress(Lodowa);

//JULIA
        Customer Julia = new Customer("Julia");
        Address Polna = new Address ("Polna","90-102", "Lodz");
        Julia.assignTrip(Warszawa);
        Julia.setAddress(Polna);



//ROBERT
        Customer Robert = new Customer("Robert");
        Address Wigury = new Address ("Wigury","95-102", "Lodz");
        Robert.assignTrip(London);
        Robert.setAddress(Wigury);

        TO.addTrip("toWarszawa",Warszawa);
        TO.addCustomer(Pat);
        TO.addCustomer(Mike);
        TO.addCustomer(Julia);
        System.out.println("Number of customers: " + TO.getCustomerCount());

        if (TO.removeCustomer(Pat)){
            System.out.println("Deleted");
        }
        else {
            System.out.println("Delete Failed");
        }



        if (TO.findCustomerByName("Julia") == null)
        {
            System.out.println("Customer not found");
        }
        else
        {
            System.out.println(TO.findCustomerByName("Julia").toString()); //pamietaj o wpisaniu imienia z linijki wyżej
        }


       System.out.println((TO.returnAllCustomers().toString()));

    }
}

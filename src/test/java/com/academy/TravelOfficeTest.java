package com.academy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TravelOfficeTest {

    @Mock
    Customer mockCustomer;
    @Mock
    Customer mockCustomer2;
    @Mock
    Address mockAddress;
    @Mock
    Trip mockTrip;
    @Mock
    Trip mockTrip2;

    @InjectMocks
    private TravelOffice travelOffice;

    @Test
    public void whenAddTrip_thenTripMapSizeIncrease() {

        Map<String,Trip> tripMap = new HashMap<>();
        String name = "Wycieczka";
        tripMap.put(name,mockTrip);

        assertEquals(1,tripMap.size());

    }


    @Test
    public void whenRemoveCustomer_thenCustomerSetDecrease() {
        Set<Customer> CustomerSet = new HashSet<>();

        CustomerSet.add(mockCustomer);
        CustomerSet.add(mockCustomer2);

        CustomerSet.remove((mockCustomer2));

        assertEquals(1,CustomerSet.size());
    }

    @Test
    public void removeTrip() {

        Map<String,Trip> tripMap = new HashMap<>();
        String name = "Wycieczka", name2 = "Wycieczka2";

        tripMap.put(name,mockTrip);
        tripMap.put(name,mockTrip2);

        tripMap.remove(name2);

        assertEquals(1  ,tripMap.size());

    }

    @Test
    public void findCustomerByName() throws NoSuchFieldException {
        new FieldSetter(travelOffice,TravelOffice.class.getDeclaredField("CustomerSet")).set(new HashSet<>());
        Customer customer = new Customer("name");
        new FieldSetter(customer, Customer.class.getDeclaredField("address")).set(mockAddress);
        new FieldSetter(customer,Customer.class.getDeclaredField("trip")).set(mockTrip);
        travelOffice.returnAllCustomers().add(customer);
        Customer custOutput = travelOffice.findCustomerByName("name");
        assertEquals(customer,custOutput);


    }


}
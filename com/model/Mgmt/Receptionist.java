package com.model.Mgmt;

import com.enums.hotelMgmt.Division;

public class Receptionist<E> extends HotelEmployee {
    Receptionist(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, int yearHired, Division division) {
        super(hotelEmployeeId, hotelId, hotelEmployeeFirstName, hotelEmployeeLastName, salary, yearHired, division);
    }
}


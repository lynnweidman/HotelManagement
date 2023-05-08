package com.model.Mgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hotel {
    private int hotelId;
    private String hotelName;
    private static int numOfEmployees = 0;

    public Hotel(int hotelId, String hotelName, int numOfEmployees) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.numOfEmployees = numOfEmployees;
    }

    public static List<Hotel> allHotels = new ArrayList<>();

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public static List<Hotel> getAllHotels() {
        return allHotels;
    }

    public static void setAllHotels(ArrayList<Hotel> allHotels) {
        Hotel.allHotels = allHotels;
    }

    @Override
    public String toString() {
        return "HotelManagement{" +
                "hotelName='" + hotelName + '\'' +
                ", numOfEmployees=" + numOfEmployees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return numOfEmployees == hotel.getNumOfEmployees() && Objects.equals(hotelName, hotel.hotelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelName, numOfEmployees);
    }
}


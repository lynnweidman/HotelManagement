package com.exceptions.hotelMgmt;

import com.model.Mgmt.Hotel;
import com.model.Mgmt.HotelEmployee;

import java.io.*;

public class Exceptions extends Exception {

    /*
    Constructor for custom exceptions.
    */
    public Exceptions(String message) {
        super(message);
    }

    /*
    Custom exception to see if there is a duplicate Id. Throws the exception and prints a message if there is.
    */
    public static void checkDuplicateIdException(int id) throws Exceptions {
        for (HotelEmployee employee : HotelEmployee.allHotelEmployees) {
            if (String.valueOf(employee.getHotelEmployeeId()).equals(String.valueOf(id))) {
                String message = "This Id is taken. Cannot have duplicate Ids.";
                Exceptions duplicateId = new Exceptions(message);
            }
        }
    }

    /*
    Custom exception to see if an employee is already entered in the list.
    Throws an exception and prints a message if they're already in the system.
    */
    public static void checkEmployeeExistsException(String firstName, String lastName) throws Exceptions {
        for (HotelEmployee employee : HotelEmployee.allHotelEmployees) {
            if (employee.getHotelEmployeeFirstName().equalsIgnoreCase(firstName) & employee.getHotelEmployeeLastName().equalsIgnoreCase(lastName)) {
                throw new Exceptions("This employee already exits.");
            }
        }
    }

    /*
    Custom exception to see if a hotel is already on the list.
    Throws the exception and prints a message if the hotel is already in the system.
    */
    public static boolean checkHotelNameException(Hotel hotelObject, String hotelNameToCheck) throws Exceptions {
        if (hotelObject.getHotelName().equalsIgnoreCase(hotelNameToCheck)) {
            System.out.println("Yes, this is the " + hotelObject.getHotelName());
            return true;
        } else {
            throw new Exceptions("This is the " + hotelObject.getHotelName() + " not the " + hotelNameToCheck);
        }
    }

    /*
    Custom exception to see if the year is entered as 4 digits.
    Throws the exception and prints a message if the year is entered with more or less than 4 digits.
    */
    public static void checkCorrectYearFormatException(int year) throws Exceptions {
        if (String.valueOf(year).length() != 4) {
            throw new Exceptions("Not proper date format.");
        }
    }

    /*
    Custom exception to see if the name contains any spaces.
    Throws the exception and prints a message if the name contains any spaces.
    */
    public static void checkCorrectNameFormatException(String name) throws Exceptions {
        if (name.contains(" ")) {
            throw new Exceptions("Names cannot contain spaces.");
        }
    }

    /*An ArithmeticException exception with try/catch that prints an error message if there is division by 0.*/
    public static int computeDivision(int a, int b) {
        int quotient = 0;

        try {
            quotient = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("NumberFormatException occurred. Cannot divide by 0.");
        }
        return quotient;
    }

    /*Throws an IOException if the file to read is not found.*/
    public static String readLine(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line = in.readLine();
        return line;
    }

    /*An FileNotFoundException with try/catch that prints an error message if the file is not found.*/

    public static void readFileLine(String fileName) throws IOException {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String fileLine = bf.readLine();
            System.out.println(fileLine);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
        }
    }
}





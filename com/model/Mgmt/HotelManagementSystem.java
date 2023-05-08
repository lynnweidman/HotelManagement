package com.model.Mgmt;

import com.enums.hotelMgmt.Division;

import java.io.IOException;

import com.exceptions.hotelMgmt.Exceptions;
import com.interfaces.hotelMgmt.Print;
import org.apache.log4j.Logger;

public abstract class HotelManagementSystem {
    private static final Logger logger = Logger.getLogger(HotelManagementSystem.class);
    public static final String FILE_NAME = "target/log.log";


    public static void main(String[] args) throws Exceptions, IOException {
        //Logs to "log4j.properties file.
        //logger.info("Hello world.");
        //logger.info("What a beatiful day.");

        Hotel hotel1 = new Hotel(1,"Hilton", 0);
        Hotel hotel2 = new Hotel(2,"Super8", 0);
        Hotel hotel3 = new Hotel(3,"Marriott", 0);
        Hotel.allHotels.add(hotel1);
        Hotel.allHotels.add(hotel2);
        Hotel.allHotels.add(hotel3);
        //Print.print(Hotel.allHotels);


//Working with the tables LinkedList.
        /*Table table1 = new Table(1, 1, 1);
        Table table2 = new Table(2, 2, 2);
        Table table3 = new Table(3, 3, 3);
        Table.tables.add(table1);
        Table.tables.add(table2);
        Table.tables.add(table3);
        System.out.println(Table.tables);
        Table.tables.remove(1);
        System.out.println(Table.tables);*/


//Working with Menu HashMap. Assigning price to a menu item.
        Menu.menuItemsWithPrice.put("Burger", 6.99);
        Menu.menuItemsWithPrice.put("PizzaSlice", 4.50);
        System.out.println(Menu.menuItemsWithPrice);

        Bill b = new Bill(1, 1, 25.99);
        //System.out.println(b.calculateBill(b.getTotalBill()));

        /*logger.info("Hello world.");
        logger.info("What a beautiful day.");*/

         /*Create hotel employees of Types HouseCleaner, Manager, and Receptionist.
         * Add them all to List allHotelEmployees.
         */
        HotelEmployee<HouseCleaner> emp1 = new HotelEmployee<>(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
        HotelEmployee<Manager> emp2 = new HotelEmployee<>(102, 1, "John", "Smith", 60000, 2022, Division.MANAGEMENT);
        HotelEmployee<Receptionist> emp3 = new HotelEmployee<>(103,1,"Sally", "Johnson", 30000,2020, Division.RECEPTIONIST);
        HotelEmployee.allHotelEmployees.add(emp1);
        HotelEmployee.allHotelEmployees.add(emp2);
        HotelEmployee.allHotelEmployees.add(emp3);
        // Calls the print method from the Print interface.
        Print.print(HotelEmployee.allHotelEmployees);

        //Adds the 2 types of RestaurantEmployee (Chef and Server) to the list restaurantEmployees.
        RestaurantEmployee<Chef> restaurantEmployee1 = new RestaurantEmployee<>(1,"David", "Smith", 60000, 2000);
        RestaurantEmployee<Server> restaurantEmployee2 = new RestaurantEmployee<>(2, "Roger", "Brown", 30000, 2020);
        RestaurantEmployee.allRestaurantEmployees.add(restaurantEmployee1);
        RestaurantEmployee.allRestaurantEmployees.add(restaurantEmployee2);
        Print.print(RestaurantEmployee.allRestaurantEmployees);

        CustomLinkedList<Table> listOfTables = new CustomLinkedList<>();
        listOfTables.insertFirst(new Table(1,1,1));
        listOfTables.insertLast(new Table(2,2,2));
        System.out.println(listOfTables.toString());

        Bill bill = new Bill (1,1,35.99);
        //Get salary increase for emp1.
        //System.out.println(emp1.getSalaryIncrease(emp1.getSalary()));

        //Calculate the bill with tax.
        //System.out.println(bill.calculateBill(bill.getTotalBill()));


        //HouseCleaner emp1 = new HouseCleaner(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
        //HotelEmployee.allHotelEmployees.add(emp1);
        //Hotel.addEmployee();
        //Manager emp2 = new Manager(102, 1, "John", "Smith", 60000, 2022, Division.MANAGEMENT);
        //HotelEmployee.allHotelEmployees.add(emp2);
       // System.out.println(HotelEmployee.allHotelEmployees);


        //System.out.println(HotelEmployee.allHotelEmployees);
        // Exceptions.checkHotelNameException(hotel1, "Hilton");
        // Exceptions.checkHotelNameException(hotel2, "Marriott");
        //Exceptions.checkCorrectNameFormatException(emp1.getHotelEmployeeFirstName());
        //Exceptions.checkEmployeeExistsException("Jessica", "Marshal");
        //Exceptions.checkDuplicateIdException(101);
        //Exceptions.checkCorrectYearFormatException(emp1.getYearHired());
        //System.out.println(Exceptions.computeDivision(1, 0));
        //Exceptions.logToFile("FILE_NAME");
        //System.out.println(Exceptions.logToFile());
        //System.out.println(Exceptions.readLine("target/log.log"));
        //System.out.println(Exceptions.readLine("log"));
        //System.out.println(Exceptions.readFileLine("target/log.log"));
        //System.out.println(Exceptions.readFileLine("log"));
        //System.out.println(Exceptions.checkForElement(13.99));
    }
}



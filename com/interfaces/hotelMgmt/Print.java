package com.interfaces.hotelMgmt;

import java.util.List;

//Prints a List with each Element on a new line.
public interface Print<T> {
    public static void print(List list) {
        list.forEach(System.out::println);
    }
}

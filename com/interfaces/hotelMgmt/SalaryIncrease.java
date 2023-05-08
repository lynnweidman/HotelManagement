package com.interfaces.hotelMgmt;

public interface SalaryIncrease {
    double FIVE_PERCENT = .05;
    double TEN_PERCENT = .10;
    int CURRENT_YEAR = 2023;

    public double getSalaryIncrease(int salary);
}

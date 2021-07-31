package com.santos.hrpayroll.entities;

public class Payment {

    private String name;
    private double dailyIncome;
    private int days;

    public Payment(){
    }

    public Payment(String name, double dailyIncome, int days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public double getTotal(){
        return days * dailyIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}

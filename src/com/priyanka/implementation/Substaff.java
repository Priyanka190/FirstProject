package com.priyanka.implementation;

public class Substaff extends Manager {
    public Substaff(double basicSalary) {
        super(basicSalary);
    }
    public void bonus() {
        this.bonuses = 0.5*basicSalary;
    }
}

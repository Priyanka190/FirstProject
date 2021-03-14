package com.priyanka.implementation;

public abstract class Manager implements Salary {
    protected double basicSalary;
    protected double earnings;
    protected double deductions;
    protected double bonuses;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void earning() {
        this.earnings = basicSalary + 0.8*basicSalary + 0.15*basicSalary;
    }
    public void deduction() {
        this.deductions = 0.12*basicSalary;
    }
    public abstract void bonus();

    public String toString() {
        return "" + basicSalary + " " + earnings + " " + deductions + " " + bonuses;
    }
}

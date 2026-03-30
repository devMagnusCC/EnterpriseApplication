package Governance;

import java.util.Scanner;

public class EmployeeCLT extends Employee {
    private int extraHours;
    private double extraHourValue;

    public EmployeeCLT(String name, String cpf, double baseSalary, int extraHours, double extraHourValue) {
        super(name, cpf, baseSalary);
        this.extraHours = extraHours;
        this.extraHourValue = extraHourValue;
    }


    public EmployeeCLT(String name, String cpf, double baseSalary) {
        super(name, cpf, baseSalary);
    }

    public EmployeeCLT(Scanner sc) {
        super(readName(sc), readCpf(sc), readBaseSalary(sc));
        System.out.print("EXTRA HOURS: ");
        this.extraHours = sc.nextInt();

        System.out.print("EXTRA HOURS VALUES: ");
        this.extraHourValue = sc.nextDouble();
        sc.nextLine();
    }

    public EmployeeCLT() {

    }

    public int getExtraHours() {
        return extraHours;
    }

    public double getExtraHourValue() {
        return extraHourValue;
    }

    private static String readName(Scanner sc) {
        System.out.print("NAME: ");
        return sc.nextLine();
    }

    private static String readCpf(Scanner sc) {
        System.out.print("CPF: ");
        return sc.nextLine();
    }

    private static double readBaseSalary(Scanner sc) {
        System.out.print("BASE SALARY: ");
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (extraHours * extraHourValue);
    }

    @Override
    public void askQuestion() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
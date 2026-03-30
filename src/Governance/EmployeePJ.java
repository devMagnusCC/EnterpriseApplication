package Governance;

import java.util.Scanner;

public class EmployeePJ extends Employee {

    private int tax;

    public EmployeePJ(String name, String cpf, double baseSalary, int tax) {
        super(name, cpf, baseSalary);
        this.tax = tax;
    }

    // construtor com scanner
    public EmployeePJ(Scanner sc) {
        super(readName(sc), readCpf(sc), readBaseSalary(sc));

        System.out.print("Tax rate (ex: 0.15 = 15%): ");
        this.tax = sc.nextInt();
        sc.nextLine();
    }


    public EmployeePJ() {
    }

    public int getTax() {
        return tax;
    }


    private static String readName(Scanner sc) {
        System.out.print("Name: ");
        return sc.nextLine();
    }

    private static String readCpf(Scanner sc) {
        System.out.print("CPF: ");
        return sc.nextLine();
    }

    private static double readBaseSalary(Scanner sc) {
        System.out.print("Base salary: ");
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }

    @Override
    public double calculateSalary() {
        return (getBaseSalary() / tax) * 100;
    }

    @Override
    public void askQuestion() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

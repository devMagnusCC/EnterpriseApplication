package Governance;

public abstract class Employee implements SalaryAndQuestion {
    private String name;
    private String cpf;
    private double baseSalary;


    public Employee(String name, String cpf, double baseSalary) {
        this.name = name;
        this.cpf = cpf;
        this.baseSalary = baseSalary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    @Override
    public abstract double calculateSalary();

    public abstract void askQuestion();

    @Override
    public String toString() {
        return
                "\nname='" + name + '\'' +
                        ", cpf='" + cpf + '\'' +
                        ", baseSalary=" + baseSalary;
    }
}
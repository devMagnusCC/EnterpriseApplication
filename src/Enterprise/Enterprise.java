package Enterprise;

import Governance.Employee;
import Governance.SalaryAndQuestion;

import java.util.ArrayList;


public class Enterprise implements SalaryAndQuestion {

    public String enterPriseName;
    public ArrayList<Employee> employees = new ArrayList<>();


    public Enterprise(String enterPriseName) {
        this.enterPriseName = enterPriseName;
    }

    public Enterprise() {
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
            System.out.println("EMPLOYEE REMOVED!");
        } else {
            System.out.println("INVALID INDEX! TRY AGAIN.");
        }
    }

    public void askEnterpriseName() {
        System.out.println("WHAT IS THE ENTERPRISE'S NAME?");
    }

    public void showEmployeesDataBase() {
        System.out.println("------ ENTERPRISE DATABASE --------");
        System.out.println("------ " + enterPriseName + " --------");
        for (Employee employee : employees) {
            System.out.println("NAME: " + employee.getName());
            System.out.println("CPF: " + employee.getCpf());
            System.out.printf("BASE SALARY: R$%.2f%n", employee.calculateSalary());
            System.out.println("----------****----------");

        }
    }

    public void options() {

        System.out.println("(1) SHOW ALL EMPLOYEES ");
        System.out.println("(2) ADD EMPLOYEE");
        System.out.println("(3) REMOVE EMPLOYEE");
        System.out.println("(4) EXIT");
    }


    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void askQuestion() {
        System.out.println("HOW MANY EMPLOYEES?");
    }


}
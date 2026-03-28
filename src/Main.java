import Enterprise.Enterprise;
import Governance.EmployeeCLT;
import Governance.EmployeePJ;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Enterprise enterprise = new Enterprise();
        enterprise.employees = new ArrayList<>();
        EmployeeCLT employeeCLT = new EmployeeCLT("ANA CLARA", "754.231.214-05", 3000, 12, 14);
        EmployeePJ employeePJ = new EmployeePJ("MARCOS ADRIANO", "212.313.414-04", 6464, 12);
        employeeCLT.calculateSalary();
        employeePJ.calculateSalary();
        enterprise.employees.add(employeePJ);
        enterprise.employees.add(employeeCLT);
        enterprise.askEnterpriseName();
        enterprise.enterPriseName = sc.nextLine();
        int option = 0;
        while(option != 4){
            enterprise.options();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    enterprise.showEmployeesDataBase();
                    break;
                case 2:
                        System.out.println("(1)-CLT OR (2)-PJ?");
                        System.out.println("CHOOSE ONE");
                        int choice = sc.nextInt();
                        sc.nextLine();
                        if(choice == 1){
                            enterprise.addEmployee(new EmployeeCLT(sc));
                        }else if(choice == 2){
                            enterprise.addEmployee(new EmployeePJ(sc));
                        }
                        System.out.println("NEW EMPLOYEE ADDED");
                        break;
                case 3:
                    enterprise.showEmployeesDataBase();
                    System.out.println("CHOOSE INDEX TO REMOVE A EMPLOYEE");
                    System.out.println("REMEMBER THAT INDEX STARTS AT 0");
                    int index = sc.nextInt();
                    sc.nextLine();
                    enterprise.removeEmployee(index);
                    break;
                case 4:
                    System.out.println("CLOSING PROGRAM...");
                    break;
                    default:
                        System.out.println("INVALID OPTION!");
                        System.out.println("TRY AGAIN.!");
                        break;

            }
        }

        sc.close();
    }
}

package Governance;

public enum EmployeeType {
    CLT,
    PJ;

    public static EmployeeType fromChoice(int choice) {
        switch (choice) {
            case 1:
                return CLT;
            case 2:
                return PJ;
            default:
                return null;
        }
    }
}

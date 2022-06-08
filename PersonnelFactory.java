public class PersonnelFactory {
    public static Person createPersonnel(int type, String firstName, String lastName, String middleName, int empID,
            double salary) {
        switch (type) {
            case 1:
                return new Employee(lastName, firstName, middleName, empID, salary);

            case 2:
                return new Executive(lastName, firstName, middleName, empID, salary);

            case 3:
                return new Volunteer(lastName, firstName, middleName, empID, salary);

            case 4:
                return new Security(lastName, firstName, middleName, empID, salary);

            default:
                return null;
        }
    }
}
public class Volunteer extends Person {
    private int empID;
    private double baseSalary;

    public Volunteer(String last, String first, String middle, int id, double sal) {
        super(last, first, middle);
        empID = id;
        baseSalary = sal;

    }

    public int getID() {
        return empID;

    }

}
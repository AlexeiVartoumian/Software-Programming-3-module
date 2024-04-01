package Exam1Take1TookTooLong.Q3StreamsAndLambdas;

public class Employee {

    private int staffNumber;

    private String name;

    private double salary;

    public Employee(int staffNumber, String name, double salary){
        this.staffNumber = staffNumber;
        this.name =name;
        this.salary = salary;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return name + " has Staff number " + staffNumber + " : and gets paid: " + salary;
    }
}

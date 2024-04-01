package Exam1Take1TookTooLong.Q3StreamsAndLambdas;

import java.util.List;
import java.util.function.BiFunction;

public class Department {

    private List<Employee> employees;

    private String name;
    public Department(int number, String name){
        Main.boilerPlate(number); // see q3.2 uses lambdas + streams
        this.name = name;
    }


//    hire(employee) - adds the new employee to the company,
//    display() - prints a list of each employee, and
//    getTotalSalaries() - which computes the total wages bill for the company.

    public void hire( Employee employee) {

        BiFunction<List<Employee>, Employee, List<Employee>> thing = (a, b) -> {
            a.add(b);
            return a;
        };
        thing.apply(employees, employee);
    }
    public void display(List<Employee> e){
        e.forEach(s -> System.out.println(e.toString()));
    }
    public double getSalary(List<Employee> employees){

        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }
    public List<Employee> getEmployees(){
        return this.employees;
    }

    public String getName(){
        return this.name;
    }
}

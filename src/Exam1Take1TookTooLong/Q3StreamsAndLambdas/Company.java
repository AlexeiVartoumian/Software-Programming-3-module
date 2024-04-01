package Exam1Take1TookTooLong.Q3StreamsAndLambdas;

import java.util.List;
import java.util.function.BiFunction;

public class Company {

    private String Name;
    private List<Employee> employees;
    private List<Department> departments;

    public Company(String name){
//        ArrayList<String> Dnames = new ArrayList<>(List.of("food","clothes","games","chairs","basketBalls")) ;
//
//
//        for (int i = 0; i <Dnames.size() ; i++) {
//
//            int random = (int) Math.random() * Dnames.size();
//            departments.add( new Department( random,Dnames.get(i)));
//        }
        //Main.boilerPlate(number); // see q3.2 uses lambdas + streams
        this.Name = name ;
    }

    public void open(Department department){
        BiFunction<List<Department>, Department, List<Department>> thing = (a, b) -> {
            a.add(b);
            return a;
        };
        thing.apply(departments,department );

    }
    public void hire(String departmentName, Employee employee){

        Department department =  departments.stream()
                .filter( i-> i.getName().equals(departmentName))
                .findFirst().orElse(null);
        BiFunction<List<Employee>, Employee, List<Employee>> thing = (a, b) -> {
            a.add(b);
            return a;
        };
        thing.apply(department.getEmployees(),employee );
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
//    public void display(List<Employee> e){
//        e.forEach(s -> System.out.println(e.toString()));
//    }
    public void display(List<Department> e){

      e.stream()
              .flatMap( i -> i.getEmployees().stream())
              .forEach(s-> System.out.println(s.toString()));
    }
    public double getSalary2(List<Department> departments){

       double val =  departments.stream()
                .flatMap( i -> i.getEmployees().stream())
                .mapToDouble(Employee::getSalary)
               .sum();
       return val;
    }
    public double getSalary(List<Employee> employees){

        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }



}

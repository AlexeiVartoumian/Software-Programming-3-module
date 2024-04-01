package Exam1Take1TookTooLong.Q3StreamsAndLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>(List.of("Tony","Silvio","Dante","charlie","Barbara"));

        List<Double> Salaries = new ArrayList<>(List.of(2000.0,10000.0,5000.0,1000.0,400.0));

        List<Integer> staffNumebr = new ArrayList<>(List.of(1,2,3,4,5));

        Supplier<Employee> generateEmployees = () -> gen(names,Salaries,staffNumebr);
        //List<Employee>  stuff = List.of(generateEmployees.get());

        List<Employee> stuff = Stream.generate(generateEmployees)
                        .limit(6)
                                .collect(Collectors.toList());
        System.out.println(stuff);
        for (int i = 0; i <stuff.size() ; i++) {
            System.out.println(stuff.get(i).getName());
            System.out.println(stuff.get(i).getSalary());
            System.out.println(stuff.get(i).getStaffNumber());
        }
//        Double totalSalary = Double.valueOf(Stream.iterate(0 , i-> i < stuff.size() , i -> i + 1)
//                .reduce(0 , (j, v) -> j + v));
        Double salary = stuff.stream()
                        .mapToDouble(Employee::getSalary)
                                .sum();
        System.out.println("total Salaray " + salary);
    }

    public static Employee gen( List<String> names, List<Double> salaries, List<Integer> staffnumber){

        return new Employee( staffnumber.get(random(names.size())) ,names.get(random(names.size())), salaries.get( random(names.size())));

    }

    public static int  random(int size){
        int number =(int) Math.floor( Math.random() * size );
        return  number;
    }
    public static List<Employee> boilerPlate(int size){
        List<String> names = new ArrayList<>(List.of("Tony","Silvio","Dante","charlie","Barbara"));

        List<Double> Salaries = new ArrayList<>(List.of(2000.0,10000.0,5000.0,1000.0,400.0));

        List<Integer> staffNumebr = new ArrayList<>(List.of(1,2,3,4,5));
        Supplier<Employee> generateEmployees = () -> gen(names,Salaries,staffNumebr);

        List<Employee> stuff = Stream.generate(generateEmployees)
                .limit(size)
                .collect(Collectors.toList());

        return stuff;
    }
}

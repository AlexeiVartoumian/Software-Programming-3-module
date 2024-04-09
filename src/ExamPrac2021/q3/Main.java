package ExamPrac2021.q3;

import q2.Employee;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Employee[] arrayofEmps = {
          new Employee(1, "jeff Bezes", 10000.0),
          new Employee(2, "bill gates", 20000.0),
          new Employee(3, "mark zyckerbersd", 30000.0),
                new Employee(-1 , null , -5000)
        };

        List<Employee> employeeList = Arrays.asList(arrayofEmps);

        /*
        (a) Write an expression which increments the salary for each employee in empList 2 marksby 10.0.
         */

        employeeList.stream()
                .map( i -> i.salaryIncrease(20))
                .forEach(System.out::println);

        /*
        (b) Write an expression which converts a stream of empIds, which are of type 3 marks
        Integer, into a stream of Employees
         */
        Stream<Employee> empids = Stream.of(1,2,3)
                .map(i -> employeeList.get(i-1).findbyId(i)  );

        empids.forEach(System.out::println);

        /*
        Write a method filterEmployees which takes a salary threshold and an array
        of employee ids, as its parameters. It first filters out null references for
        invalid employee ids and then, applies a filter to only keep employees with
        salaries over a certain threshold. The method should return the result as a
        List<Employee>.
         */
        Object thing = filterEmployees(20000, arrayofEmps);
        System.out.println(thing);
        /*
        (d) Suppose we have the following: 3 marks
        List<List<String>> namesNested = Arrays.asList(
        Arrays.asList("Jeff", "Bezos"),
        Arrays.asList("Bill", "Gates"),
        Arrays.asList("Mark", "Zuckerberg"));
        Write an expression which will enable the processing of the data as a single
        list
         */
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> unnestes = namesNested.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(unnestes);
    }

    public static  List<Employee> filterEmployees(double threshold , Employee[] someguys){

         return  Arrays.asList(someguys).stream()
                .filter(i -> i.id() >0 )
                .filter(j -> j.salary() > threshold)
                .toList();
    }

}

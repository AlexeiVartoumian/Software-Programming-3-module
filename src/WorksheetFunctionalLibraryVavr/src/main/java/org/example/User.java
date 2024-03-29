//package WorksheetFunctionalLibraryVavr.src.main.java.org.example;
//
//import io.vavr.collection.List;
//import java.util.Arrays;
//import java.util.Random;
//import java.util.function.Supplier;
//
//public class User {
//
//    private int age;
//
//    private String name;
//
//    public User(String name , int age){
//        this.age = age;
//        this.name = name;
//    }
//    public static int randomizer(int number){
//
//        Random random = new Random();
//        System.out.println(random.nextInt(number) );
//        return random.nextInt(number);
//    }
//    public static List<User> generateUser(int number){
//        String[] names = { "tony", "dante","Silvio", "Patrick","Chucky", "samanatha"};
//
//        //this genrated the same object everyt time
////        Supplier<User> generator  = () -> {
////            return new User(names[randomizer(names.length)], randomizer(100) );
////        };
////
////        List<User> users = List.fill( number , generator.get());
//
////        User[] users = new User[number];
////        Arrays.setAll(users , i -> new User(names[randomizer(names.length)], randomizer(100)) );
//        List<User> users1 = List.fill(number , ()-> new User(names[randomizer(names.length)], randomizer(100)));
//
//        return users1;
//    }
//    public int getAge(){
//        return this.age;
//    }
//    public String getName(){
//        return this.name;
//    }
//}

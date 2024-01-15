package Week1.Quiz1.Q7;

//Will the following method compile? If not, why not?
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // the following methof should compile as all items in the list are of type number and no
        // modifications are being performed
    }
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}

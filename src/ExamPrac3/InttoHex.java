package ExamPrac3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InttoHex {


    int[] numbers;

    ArrayList<Integer> actual = new ArrayList<>();
    HashMap<String , String> table = new HashMap();
    public InttoHex(int initialnum ){

        int[] thing =  new int[ howmany(initialnum)+1];
        Arrays.fill(thing ,0 );
        numbers = thing;
        table.put( "0000", "0");
        table.put( "0001", "1");
        table.put( "0010", "2");
        table.put( "0011", "3");
        table.put( "0100", "4");
        table.put( "0101", "5");
        table.put( "0110", "6");
        table.put( "0111", "7");
        table.put( "1000", "8");
        table.put( "1001", "9");
        table.put( "1010", "A");
        table.put( "1011", "B");
        table.put( "1100", "C");
        table.put( "1101", "D");
        table.put( "1110", "E");
        table.put( "1111", "F");

    }
    public static int howmany( int number){
        if (number == 1){
            return 0;
        }
        int count = 0;
        int start = 1;
        while (start <= number){
            start*=2;
            count+=1;
        }
        return count-1;
    }

    public int[] placer (int number , int[] place){
        place[number] = 1;
        return place;
    }
    public int[] getNumbers(){
        return this.numbers;
    }

    public ArrayList<Integer> converter(int[]numbers){
        int diff =  4 - numbers.length %4;
        actual = (ArrayList<Integer>) Stream
                .generate(()-> 0)
                .limit(diff)
                .collect(Collectors.toList());

        for (int i = numbers.length-1; i >=0 ; i--) {
            actual.add(numbers[i]);
        }
        return actual;
    }
    public String reader(ArrayList<Integer> thing){
        int counter = 0;
        String res = "";
        String inter = "";
        for (int i = 0; i < thing.size(); i++) {
            counter+=1;
            inter+= thing.get(i);
            if (counter== 4){
                res+= table.get(inter);
                counter = 0;
                inter = "";
            }
        }
        return res;
    }

    public ArrayList<Integer> getActual(){
        return actual;
    }
}


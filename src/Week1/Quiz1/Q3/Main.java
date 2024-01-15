package Week1.Quiz1.Q3;

import java.util.Arrays;

//Write a generic method to exchange the positions of two different elements in an array.
public class Main {
    public static void main(String[] args) {

        String[] names = {"Tony", "Silvio", "Paulie"};
        Integer[] nums = {1,2,3};

        exchangePos(names, 1 ,2);
        exchangePos(nums, 0,1);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(nums));
    }


    public static <T> T[]  exchangePos(T[] arr, int val1, int val2){
        T temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
        return arr;
    }
}

package ExamPrac3.Take2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack <T> {


    List<T> stack;

    int size;
    int count;
    public Stack(int size) throws NegativeArraySizeException{
        try{
            if (size <0){
                throw new NegativeArraySizeException("Too small");
            }
            this.size = size;
            this.stack = new ArrayList<T>();
            this.count = 0;
        }catch(Exception e){
            System.out.println(e + "nononono");
        }

    }

    public void push (T item) throws IndexOutOfBoundsException{
        try {
            if (count >=size){
                throw new IndexOutOfBoundsException(" too much in stack");
            }
            count+=1;
            stack.add(item);
        }catch(Exception e ){
            System.out.println(e + "nononono");
        }
    }
    public void pop() throws NoSuchElementException {
        try {
            System.out.println(count);
            if (count ==0){
                throw new NoSuchElementException(" stack empty");
            }
            count-=1;
            stack.removeLast();
        }catch(Exception e ){
            System.out.println(e + "nononono");
        }
    }
    public void peek() throws NoSuchElementException {
        try {
            if (count ==0){
                throw new NoSuchElementException(" stack empty");
            }
            System.out.println(stack.get(count-1));
        }catch(Exception e ){
            System.out.println(e + "nononono");
        }
    }
}

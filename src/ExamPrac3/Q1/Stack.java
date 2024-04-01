package ExamPrac3.Q1;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack {

    int maxSize;

    List<Object> stack;

    public Stack(int maxSize){
       this.stack = new LinkedList<>();
       this.maxSize = maxSize;
    }

    public void push(Object someObject) throws IndexOutOfBoundsException{

        try{
            if (stack.size() < maxSize){
                stack.add(someObject);
            }
            else{
                throw new IndexOutOfBoundsException( );
            }

        }catch(IndexOutOfBoundsException e){
            System.out.println(e +  " Stack Overflow");
        }
    }

    public void pop() throws NoSuchElementException {
        try{
            stack.removeLast();
        }catch ( NoSuchElementException e){
            System.out.println(e +  " Tried to remove from empty list");
        }
    }
    public Object peek(){
        if (!stack.isEmpty()){
            return stack.get(0);
        }
        return null;
    }

}

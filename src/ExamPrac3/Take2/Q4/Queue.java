package ExamPrac3.Take2.Q4;

import java.util.LinkedList;

public class Queue<T> {

   LinkedList<T> queue;

   public Queue(){
       this.queue = new LinkedList<>();
   }
    public void addLast(T item){
        queue.addLast(item);
    }
    public T removeFirst(){
        return queue.pollFirst();
    }
    public T peek(){
       return queue.peekFirst();
    }
}

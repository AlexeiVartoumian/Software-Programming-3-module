package ExamPrac3.Take2.Q4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
    /*
    imple a queue and do some tests on it.
     */

    private Queue<Integer> queue;
    private int length;
    @BeforeEach
    void setUP(){
        this.queue = new Queue<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        length = 3;
    };
    @Test
    void peek(){
        queue.peek();
        int count = 0;
        Integer value = queue.removeFirst();

        if (value != null){
            count+=1;
        }
        while (queue.removeFirst()!= null){
            count+=1;
        }
        Assertions.assertEquals(3 , count );
    }
    @Test
    void removefirst(){
        Integer val = queue.removeFirst();
        Assertions.assertEquals(1, val);

    }
}
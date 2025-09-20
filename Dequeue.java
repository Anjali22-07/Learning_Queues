import java.util.*;

public class Dequeue {   //Double Ended Queue
    public static void main(String[] args) {
        
         Deque<Integer> dq= new LinkedList<>();
         dq.addFirst(1);
         dq.addFirst(2);
         dq.addLast(5);
         dq.addLast(10);
         dq.addLast(15);
         System.out.println(dq);    //[2, 1, 5, 10, 15]
         dq.removeFirst();
          System.out.println(dq);
          dq.removeLast();
        
           System.out.println(dq);
         
    }
}

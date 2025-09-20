import java.util.*;

public class BasicsSTL{
    
    public static void main(String[] args) {
        
        //This class contains basics about QUEUES
/*     Queue<Integer> qt= new Queue<>();   //This cannot be used as Queue in java's collection framework is abstract thus*/

//we use either ArrayDeque or LinkedList
        
        Queue<Integer> qt= new LinkedList<>();
        /*Queue is an interface in Java.
         LinkedList is a class that implements multiple interfaces (List, Deque, Queue). */

         //to add elements in Queue 

          qt.add(5);
          qt.add(10);
          qt.add(15);
          qt.add(2);
          qt.add(13);
          System.out.println(qt);
          //to determine the size of the queue
        System.out.println(qt.size());
        //to delete an element from queue
         qt.remove();
          System.out.println(qt);
          System.out.println(qt.size());
         //or we can also use poll()
         qt.poll();
          System.out.println(qt);
          System.out.println(qt.size());
         //to get the top most element of queue
         qt.peek(); //or qt.element();  //both return the top most element of the queue
              System.out.println(qt.element());
    }
}
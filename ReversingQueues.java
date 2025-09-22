import java.util.*;

public class ReversingQueues {
    
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        Queue<Integer> qt= new LinkedList<>();
           qt.add(1);
           qt.add(2);
           qt.add(3);
           qt.add(4);
           qt.add(5);

           System.out.println("The original Queue:"+ qt);

    while(!qt.isEmpty()){
         
          st.push(qt.remove());
    }
  
       while(!st.isEmpty()){

             qt.add(st.pop());
       }

        System.out.println("Queue after reversing: "+qt);
    }
}

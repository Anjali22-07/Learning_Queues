import java.util.*;

public class ReverseFirstKelements {
     public static void main(String[] args) {
        Queue<Integer> qt= new LinkedList<>();
        Stack<Integer> st= new Stack<>();

        //Let us assume k=3

        qt.add(1);
        qt.add(2);
        qt.add(3);
        qt.add(4);
        qt.add(5);
        System.out.println("The original Queue:"+qt);

        for(int i=0;i<3;i++){
                st.push(qt.remove());
        }
        while(!st.isEmpty()){
            qt.add(st.pop());
        }
       
          for(int i=0;i<2;i++){    //loop runs n-k times--because we need remaining numbers
                  qt.add(qt.remove());
          }
        System.out.println("the reversed queue is:"+qt);
     }
}

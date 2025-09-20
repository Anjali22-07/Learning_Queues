
import java.util.*;
public class SomeQues {
    
   
    public static void main(String[] args) {
        //print all the elements present
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> r= new LinkedList<>();
        q.add(7);
        q.add(0);
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(2);
        
        System.out.println(q);

        while(!q.isEmpty()){
            
            int x=q.remove();
            System.out.print(x+" ");
            r.add(x);
        }

        while(r.size()>0){
            q.add(r.poll());
        }
    }
}

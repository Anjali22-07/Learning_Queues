public class LinkedListImplementation {
    
    public static class Node{
        Node next;  //stores the address
        int data; //stores the data in linked list

        Node(int data){
          this.data=data;
        }
    }

    public static class QueueL{
        Node head=null;
        int size=0;
        Node tail=null;

        public void add(int val){
           //create a new node 
           Node temp=new Node(val);
           //inserting at end because queue is first in first out
           if(head==null){
            head=temp;
            //return;
           }
           else{
            tail.next=temp;
           }
           tail=temp;
           size++;
        }   

        public int remove(){
            
            if(size==0){
                System.out.println("Queue is Empty()");
                return -1;
            }
                int x=head.data;              
                 head=head.next;
                 size--;
            
            return x;
        }
        
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty()");
                return -1;
            }
            int x=head.data;
            return x;
        }

        public void Display(){
             if(size==0){
                System.out.println("Queue is Empty()");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
            }

        }
     
    public static void main(String[] args) {
         QueueL q= new QueueL();
        q.Display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.Display();
           System.out.println(q.peek());
        q.remove();
         q.Display();
         System.out.println(q.peek());
           q.remove();
             q.Display();
    }
}

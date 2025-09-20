public class CircularQueueLL {
    
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }

    public static class CircularQL{
        Node head=null;
        Node tail=null;
        int size=0;

      public void add(int val){
        Node temp= new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
            tail.next=temp;
        }
        tail=temp;
        tail.next=head;
        size++;
      }

      public int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
          int x=head.data;
          head=head.next;
          tail.next=head;
          size--;
          return x;
      }

      public int peek(){
         if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int x= head.data;
        return x;
      }

      public void Display(){
        Node temp=head;
         if(size==0){
            System.out.println("Queue is empty");
            return;
        }
       for(int i=0;i<size;i++){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
         CircularQL q= new CircularQL();
        q.Display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.Display();
           System.out.println("The element at top is:"+q.peek());
        q.remove();
        System.out.println();
         q.Display();
         System.out.println("The element at top is:"+q.peek());
           q.remove();
             q.Display();
    }
}

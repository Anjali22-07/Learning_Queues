public class ImplementingDeque {
    
    //we will be implementing Deque using Array from scratch 
    public static class DequeA{

        int arr[]= new int[7];
        int front=-1;
        int rear=-1;
        int size=0;

        public void addFirst(int val){
           if(size==arr.length) {
             System.out.println("Queue is full!");
             return;
             } else if(size==0){
                front=rear=0;
                arr[0]=val;
             }else if(rear<arr.length-1){
                for(int i=rear+1;i>0;i--){
                    arr[i]=arr[i-1];
                }
                arr[0]=val;
                rear++;
             }
             size++;
            
        }

        public void addLast(int val){
            if(size==0){
                front=rear=0;
                arr[0]=val;
            }else {
            arr[++rear]=val;
            }
            size++;
        }

        public int removeFirst(){
            if(size==0){
                System.out.println("Queue is Full");
                return -1;
            }
              int val= arr[front];
              front++;
              return val;
        }

        public int  removeLast(){
            if(size==0){
                System.out.println("Queue is Full");
                return -1;
            }
               int val=arr[rear];
               rear--;
               return val;
        }

        public int peekFirst(){
            if(size==0){
                System.out.println("Queue is Full");
                return -1;
            }
            return arr[front];
        }

        public int peekLast(){
             if(size==0){
                System.out.println("Queue is Full");
                return -1;
            }
            return arr[rear];
        }

         public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            else   {
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
         }
       
        }

        public static void main(String[] args) {
            DequeA dq=new DequeA();
         dq.addFirst(1);
         dq.addFirst(2);
         dq.addLast(5);
         dq.addLast(10);
         dq.addLast(15);
           dq.display();    //[2, 1, 5, 10, 15]
          dq.removeFirst();
             dq.display();   //1 5 10 15 
        //   System.out.println(dq);
         dq.removeLast();
            dq.display();   // 1 5 10 
        
        //    System.out.println(dq);
         
        }
        }
    


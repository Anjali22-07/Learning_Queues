public class ArrayImplementations{
   
    public static class QueueA{
       private int[] arr= new int[100];
       private int f=-1;
        private int r=-1;
        private int size=0;
        //method to add value in queue
        public void add(int val){
              if(r==arr.length) {
                 System.out.println("Queue is full");
                 return;
              }
              if(f==-1)  {   //queue is currently empty
                f=r=0;
                arr[0]=val;
             }
              else{
                arr[++r]=val;
               }
              size++;
        }
        
        public int remove(){
              if(size==0){
                System.out.println("Queue is Empty!");
                 return -1;
              }
               int x=arr[f];
               f++;
               return x;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                 return -1;
              }
              return arr[f];
        }

        public boolean isEmpty(){
            if(size==0)  return true;
            else return false;
        }

        public void Display(){
            if(size==0){
                System.out.println("queue is empty!");
                return;
            }else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        QueueA q= new QueueA();
        q.Display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.Display();
        q.peek();
        q.remove();
        q.peek();
        q.Display();
    }
}
public class CircularQueue {
    
    public static class Cqueue{
        int[] arr=new int[7];
        int r=-1;
        int f=-1;
        int size=0;
        int n= arr.length;
        public void add(int val){
            if(size==0){
                r=f=0;
                arr[0]=val;
            }else if(size==n){
                System.out.println("Queue is Full");
                return;
            }else if(r<n-1){
                arr[++r]=val;
            }  else if(r==n-1){
                r=0;
                arr[0]=val;
            }
            size++;
          }

          public int remove(){
            
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                int val= arr[f];
                if(f==n-1)  f=0;
                else f++;
                size--;
                return val;
                
            }
          }

          public int peek(){
             
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
          }

         public void Display(){
               if(size==0){
                System.out.println("Queue is Empty");
                return;
            }else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }else {
                for(int i=f;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
               }
                  System.out.println();
          }
       
        }
    
    public static void main(String[] args){

        Cqueue cq=new Cqueue();
        cq.Display();
        cq.add(1);
        cq.add(2);
       cq.add(3);
        cq.add(4);
        cq.add(5);
         cq.add(6);
         cq.remove();
         cq.remove();
       cq.add(7);
        cq.add(8);
        cq.add(9);
        cq.Display();
    }
}

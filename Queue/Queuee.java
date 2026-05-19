
public class Queuee {

    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr=new int[5];
            size =n;
            rear=-1;
        }

        public static boolean IsEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
            }
            rear=rear+1;
            arr[rear]=data;
        }

        public static int remove(){
            if(IsEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peak(){
            if(IsEmpty()){
                System.out.println("stack empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main (String[]args){
        queue q= new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.IsEmpty()){
            System.out.println(q.peak());
            q.remove();
        }
        
    }
}

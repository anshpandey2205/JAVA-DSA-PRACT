public class Circularqueue {

    static class circuArrQue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        circuArrQue(int n){
            arr=new int[3];
            size=n;
            front = -1;
            rear = -1;
        }

        public static boolean IsEmpty(){
            return front==-1 && rear==-1;
        }

        public static boolean IsFull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(IsFull()){
                System.out.println("Queue is full");
                return;
            }

            // add first element 
            if(front==-1){
                front =0;
            }

            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            if(IsEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result= arr[front];

            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(IsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[]args){
        circuArrQue q= new circuArrQue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.IsEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

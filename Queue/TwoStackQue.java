import java.util.*;
public class TwoStackQue {
    static class Queue{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();

        public static boolean Isempty(){
            return s1.isEmpty();
        } 
        
        public static void Add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(Isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(Isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
      }
    public static void main(String[]args){
        Queue q= new Queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);

        while(!q.Isempty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

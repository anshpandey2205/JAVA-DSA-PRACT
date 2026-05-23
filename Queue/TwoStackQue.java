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
      }
    public static void main(String[]args){

    }
}

import java.util.*;
public class LinklistQueue {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    } 

    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean IsEmpty(){
            return head==null && tail ==null;
        }

        public static void Add(int data){

            Node newNode= new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }

            tail.next=newNode;
            tail=newNode;
        }

        public static int Remove(){
            if(IsEmpty()){
                System.out.println("Queue is empty");
                return -1;  
            }

            int front = head.data;

            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }

        public static int peek(){
            if(IsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[]args){

        Queue q= new Queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        while(!q.IsEmpty()){
            System.out.println(q.peek());
            q.Remove(); 
        }
    }
}

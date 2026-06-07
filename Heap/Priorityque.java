import java.util.*;

public class Priorityque {
    public static void main(String args[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(7);
        pq.add(4);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

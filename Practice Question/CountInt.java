import java.util.*;
public class CountInt {
    public static void main(String args[]){
        LinkedList<Object>list=new LinkedList<>();

        list.add(1);
        list.add(2.5);
        list.add(200000000d);
        list.add("Anshul");
        list.add(3);
        int count=0;

        for(Object o:list){
            if(o instanceof Integer){
                count++;
                System.out.println(o);
            }
        }

        System.out.println(count);

        

        
    }
}

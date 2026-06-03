import java.util.*;
public class Link{
    public static void main(String[]args){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

            for(int i=list.size()-1;i>=0;i--){
                System.out.println(list.get(i));
            }

            System.out.println(list.remove(2));
            System.out.println(list);

            int first=list.get(1);
            int second=list.get(2);
            int temp=0;

            temp=first;
            second=temp;
            first=second;
            System.out.println(list);

            


        
    }
}
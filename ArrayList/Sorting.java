import java.util.*;
public class Sorting {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(8);
        list.add(3);
        list.add(10);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        // ASCENDING ORDER

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}

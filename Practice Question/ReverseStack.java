import java.util.*;
public class ReverseStack {
    public static void main(String[]args){
        Stack<Integer>s=new Stack<>();
        Stack<Integer>s2=new Stack<>();

        

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);


        for(int i=s.size();i>0;i--){
            s2.push(i);
        }

        while(!s2.isEmpty()){
            System.out.println(s2.peek());
            s2.pop();
        }
    }
}

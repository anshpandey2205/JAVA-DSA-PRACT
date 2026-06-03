import java.util.*;
public class stack {
    public static void main(String[]args){
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack2.addAll(stack);
        System.out.println(stack2);
        
    }
}

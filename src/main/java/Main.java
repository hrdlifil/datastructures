import Stack.Stack;
import Stack.StackImpl;

public class Main {
    public static void main(String[] args){
        Stack stack = new StackImpl(5);
        stack.push(9);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

    }
}
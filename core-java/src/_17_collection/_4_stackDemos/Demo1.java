package _17_collection._4_stackDemos;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);//3
        stack.push(200);//2
        stack.push(400);//2
        stack.push(400);//1
        stack.push(400);//0

        System.out.println("size of the stack "+stack.size());
        System.out.println("search element "+stack.search(400));//it will return last occurance index
        System.out.println("is stack empty "+stack.empty());
        System.out.println("element on top of the stack "+stack.peek());
        System.out.println("pop operation "+stack.pop());
        System.out.println("pop operation "+stack.pop());
        System.out.println("pop operation "+stack.pop());
        System.out.println("pop operation "+stack.pop());
        System.out.println("pop operation "+stack.pop());
    }
}

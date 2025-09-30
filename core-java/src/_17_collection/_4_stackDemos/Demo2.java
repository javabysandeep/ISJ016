package _17_collection._4_stackDemos;

import java.util.Stack;

public class Demo2 {
    public static void main(String[] args) {
        String expression1 = "({[]})";//balanced
        String expression2 = "({[})";//unbalanced
        System.out.println(expression1 + " is the expression balanced? " + isExpressionBalanced(expression1));
        System.out.println(expression2 + " is the expression balanced? " + isExpressionBalanced(expression2));
        System.out.println(isExpressionBalanced("))))"));
        System.out.println(isExpressionBalanced(")))()"));
    }

    private static boolean isExpressionBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            //push the opening braces to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // closing braces
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(')
                        || (ch == '}' && top != '{')
                        || (ch == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

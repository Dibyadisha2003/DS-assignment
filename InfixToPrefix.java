import java.util.Stack;
public class InfixToPrefix {
    static boolean isOperand(char ch) {
        return Character.isLetter(ch);
    }
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String reverse(String exp) {
        StringBuilder sb = new StringBuilder(exp);
        sb.reverse();
        return sb.toString();
    }
    static String replaceBrackets(String exp) {
        StringBuilder result = new StringBuilder();
        for (char ch : exp.toCharArray()) {
            if (ch == '(')
                result.append(')');
            else if (ch == ')')
                result.append('(');
            else
                result.append(ch);
        }
        return result.toString();
    }
    static String getPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (isOperand(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    stack.pop();
                }
            } else { 
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
    static String infixToPrefix(String exp) {
        exp = reverse(exp);
        exp = replaceBrackets(exp);
        String postfix = getPostfix(exp);
        return reverse(postfix);
    }
    public static void main(String[] args) {
        String expression = "((a/b)+c)-(d+(e*f))";
        System.out.println("Infix expression: " + expression);
        String prefix = infixToPrefix(expression);
        System.out.println("Prefix expression: " + prefix);
    }
}
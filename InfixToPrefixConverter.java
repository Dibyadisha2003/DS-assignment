import java.util.Stack;

public class InfixToPrefixConverter {
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
    static void reverse(char[] exp) {
        int i = 0, j = exp.length - 1;
        while (i < j) {
            char temp = exp[i];
            exp[i] = exp[j];
            exp[j] = temp;
            i++;
            j--;
        }
    }
    static void replaceBrackets(char[] exp) {
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == '(') exp[i] = ')';
            else if (exp[i] == ')') exp[i] = '(';
        }
    }
    static String toPostfix(char[] exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : exp) {
            if (isOperand(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
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
    static String infixToPrefix(String expression) {
        char[] exp = expression.toCharArray();
        reverse(exp);
        replaceBrackets(exp);
        String postfix = toPostfix(exp);
        char[] prefixArr = postfix.toCharArray();
        reverse(prefixArr);
        return new String(prefixArr);
    }
    public static void main(String[] args) {
        String expression = "((a/b)+c)-(d+(e*f))";
        System.out.println("The infix is: " + expression);
        String prefix = infixToPrefix(expression);
        System.out.println("The prefix is: " + prefix);
    }
}
class Stack {
    int top;
    int capacity;
    int[] array;
    Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.array = new int[capacity];
    }
    boolean isFull() {
        return top == capacity - 1;
    }
    boolean isEmpty() {
        return top == -1;
    }
    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        array[++top] = item;
        System.out.println(item + " pushed to stack");
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return Integer.MIN_VALUE;
        }
        return array[top--];
    }
    int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return array[top];
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(100);
        stack.push(47);
        stack.push(84);
        stack.push(61);
        System.out.println(stack.pop() + " popped from stack");
    }
}
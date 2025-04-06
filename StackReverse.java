class StackNode {
    int data;
    StackNode next;
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedStack {
    StackNode top;
    boolean isEmpty() {
        return top == null;
    }
    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }
    void print() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtBottom(int item) {
        if (isEmpty()) {
            push(item);
        } else {
            int temp = pop();
            insertAtBottom(item);
            push(temp);
        }
    }
    void reverse() {
        if (!isEmpty()) {
            int temp = pop();
            reverse();
            insertAtBottom(temp);
        }
    }
}
public class StackReverse {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.print("Original Stack:");
        stack.print();
        stack.reverse();
        System.out.print("Reversed Stack:");
        stack.print();
    }
}
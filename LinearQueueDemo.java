import java.util.Scanner;
class LinearQueue {
    private int front, rear, size;
    private int[] queue;
    public LinearQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }
    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full! (Overflow)");
            return;
        }
        if (front == -1)
            front = 0;
        queue[++rear] = data;
        System.out.println(data + " enqueued.");
    }
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty! (Underflow)");
            return;
        }
        System.out.println(queue[front] + " dequeued.");
        front++; 
        if (front > rear) { 
            front = rear = -1;
        }
    }
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
public class LinearQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        LinearQueue queue = new LinearQueue(size);
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
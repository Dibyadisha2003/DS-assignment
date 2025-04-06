import java.util.Scanner;
public class InsertionDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = sc.nextInt();
                    System.out.print("Enter position (0 to " + n + "): ");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = n; i > pos; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[pos] = element;
                        n++;
                        System.out.println("Element inserted successfully.");
                    }
                    break;
                case 2:
                    System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
                    int delPos = sc.nextInt();
                    if (delPos < 0 || delPos >= n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = delPos; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        n--;
                        System.out.println("Element deleted successfully.");
                    }
                    break;
                case 3:
                    System.out.println("Current Array:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
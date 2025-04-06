import java.util.Scanner;
public class InsertAtBeginning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to be inserted: ");
        int elem = scanner.nextInt();
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = elem;
        size++; 
        System.out.print("Array after inserting element: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
public class DeleteElementFromArray {
    public static int findElement(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    public static int deleteElement(int[] arr, int n, int key) {
        int pos = findElement(arr, n, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    public static void main(String[] args) {
        int[] arr = new int[10]; 
        arr[0] = 10;
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 20;
        int n = 5;
        int key = 30;
        System.out.println("Array before deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        n = deleteElement(arr, n, key);
        System.out.println("\nArray after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
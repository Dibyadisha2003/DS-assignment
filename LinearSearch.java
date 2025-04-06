public class LinearSearch {
    public static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 6, 40};
        int key = 40;
        int position = findElement(arr, key);

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: " + (position + 1));
    }
}
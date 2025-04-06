public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, mid + 1, high, key);
        return binarySearch(arr, low, mid - 1, key);
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10};
        int key = 10;
        int index = binarySearch(arr, 0, arr.length - 1, key);
        System.out.println("Index: " + index);
    }
}
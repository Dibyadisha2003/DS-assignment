class BinarySearch {
    public static int binarySearch(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1; 
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binarySearch(arr, low, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, high, target);
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 17, 18, 20, 44, 56, 88, 197};
        int target = 20;
        int index = binarySearch(arr, 0, arr.length - 1, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
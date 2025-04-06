public class ReverseWithExtraArray {
    public static void reverseArrayExtraArray(int[] arr) {
        int size = arr.length;
        int[] reversedArr = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArr[i] = arr[size - i - 1];
        }
        System.out.print("Reversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        reverseArrayExtraArray(originalArr);
    }
}

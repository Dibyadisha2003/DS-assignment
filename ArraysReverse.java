import java.util.Arrays;
public class ArraysReverse{
    public static void main(String[] args){
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }
        System.out.println("Original Array: " + Arrays.toString(originalArray));
    }
}
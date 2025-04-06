public class SumNaturalNumbers {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        findSum(10000000);
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0;
        System.out.printf("findSum(int n) took %.5f seconds to execute\n", timeTaken);
    }
}
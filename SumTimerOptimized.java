public class SumTimerOptimized {
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        findSum(10000000);
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0;
        System.out.printf("findSum(int n) took %.6f seconds to execute\n", timeTaken);
    }
}
import java.util.Scanner;
public class FunTimer {
    public static void fun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("fun() starts");
        System.out.println("Press Enter to stop fun");
        sc.nextLine();  
        System.out.println("fun() ends");
        sc.close();
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        fun();
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0; 
        System.out.printf("fun() took %.3f seconds to execute\n", timeTaken);
    }
}
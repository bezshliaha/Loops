package app;

public class Main01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int sum = 0;

        for (int num = a; num <= b; num++) {
            sum += num;

            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d%n", sum);
    }
}

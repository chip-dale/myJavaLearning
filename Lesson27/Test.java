import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUM:\t");
        long num = sc.nextLong();

        long n = num;
        int count = (n == 0) ? 1 : 0;
        while (n != 0) {
            count++;
            n /= 10;
        }

        int result = 0;
        for(int i = 0; i < count; i++) {
            long tmp = num;
            tmp %= 10;
            num /= 10;
            result += tmp;
        }
        System.out.println("SUM OF DIGITS:\t" + result);
    }
}

package DAY3;

import java.util.Scanner;

public class SumofDigits {
    static void main() {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int rem;
        int sum = 0;
        int reverse = 0;
        while (n != 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.print(sum);
    }
}

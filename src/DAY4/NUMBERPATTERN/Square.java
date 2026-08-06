package DAY4.NUMBERPATTERN;

import java.util.Scanner;

public class Square {
    public static void main() {
//        int n;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i+ " ");
            }
            System.out.print("\n");
        }
    }
}

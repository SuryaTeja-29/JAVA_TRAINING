package DAY4;

import java.util.Scanner;

import java.util.Scanner;
public class UpsideLeftTriangle {
//    package DAY4;



    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}


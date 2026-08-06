package DAY4;

import java.util.Scanner;

public class Diamond {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i = n-1; i >= 1; i--) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

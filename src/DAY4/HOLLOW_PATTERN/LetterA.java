package DAY4.HOLLOW_PATTERN;

import java.util.Scanner;

public class LetterA {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        int n = 7;
        for (int i = 1; i <= n; i++) {
            //S
            for (int j = 1; j <= n; j++) {
                if ((i==1 && j>1) || (j==1 && i<n/2+1 && i>1) || (i==n/2+1 && j>1 && j<n) || (j==n && i>n/2+1 && i<n) || (i==n && j<n))
                    System.out.print("S ");
                else
                    System.out.print("  ");
            }
            System.out.print("    ");
            //u
            for (int j = 1; j <= n; j++) {
                if ((i==n && j>1 && j<n) || (j == 1 && i<n) || (j==n && i<n))
                    System.out.print("U ");
                else
                    System.out.print("  ");
            }
            System.out.print("    ");
            //r
            for (int j = 1; j <= n; j++) {
                if ((i==1 && j>1 && j<n) || (j == 1 && i>1) || (j==n && i<n/2+1 && i>1) || (i==n/2+1 && j!=n) || (i==j && i>n/2+1))
                    System.out.print("R ");
                else
                    System.out.print("  ");
            }
            System.out.print("    ");
            //y
            for (int j = 1; j <= n; j++) {
                if ((j==1 && i<=n/2) || (i == n/2+1 && j>1 && j<n) || (j==n && i<n/2+1) || (j==n/2+1 && i>n/2))
                    System.out.print("Y ");
                else
                    System.out.print("  ");
            }

            //a
            System.out.print("    ");
            for (int j = 1; j <= n; j++) {
                if ((i==1 && j>1 && j<n) || (j == 1 && i>1) || (j==n && i!=1) || (j<=n && i==n/2+1))
                    System.out.print("A ");
                else
                    System.out.print("  ");
            }
            System.out.print("        ");
//            //t
//            for (int j = 1; j <= n; j++) {
//                if (i==1 || j == n/2+1)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.print("    ");
//            //e
//            for (int j = 1; j <= n; j++) {
//                if (j==1 || i == 1 || i == n/2+1 || i==n)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.print("    ");
//            //j
//            for (int j = 1; j <= n; j++) {
//                if (i==1 || j == n/2+1 || (i == n && j<=n/2+1) || (j==1 && i>n/2+1))
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.print("    ");
//            //a
//            for (int j = 1; j <= n; j++) {
//                if (i==1 || j == 1 || j==n || (j<=n && i==n/2+1))
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.print("    ");

            System.out.println();
        }
    }
}

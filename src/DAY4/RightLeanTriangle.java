package DAY4;

import java.util.Scanner;

public class RightLeanTriangle {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        for(int i=2; i<=n; i++){
            for( int j=1; j<=n-i+1; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

}

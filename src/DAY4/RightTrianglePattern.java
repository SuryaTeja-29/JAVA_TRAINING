package DAY4;

import java.util.Scanner;

public class RightTrianglePattern {
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
    }
}

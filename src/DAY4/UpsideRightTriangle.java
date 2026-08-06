package DAY4;

//package DAY4;

import java.util.Scanner;

public class UpsideRightTriangle {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for( int j=i; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}


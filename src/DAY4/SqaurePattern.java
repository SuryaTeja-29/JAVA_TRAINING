package DAY4;

import java.util.Scanner;

public class SqaurePattern {
    public static void main(){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for( int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}

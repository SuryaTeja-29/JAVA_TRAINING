package DAY3;

import java.util.Scanner;

public class armstrong {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 10;
        int b = (n/10) % 10;
        int c = n / 100;

        if((a*a*a + b*b*b + c*c*c) == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}

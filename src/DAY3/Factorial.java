package DAY3;

import java.util.Scanner;

public class Factorial {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if(n<1){
            System.out.println("Factorial not possible");
        }
        else{
            long factorial = 1;

            for(int i = 1; i<=n; i++){
                factorial = factorial*=i;
            }
            System.out.println("Factorial of " + n + " " + "is" + " " + factorial);
        }
    }
}

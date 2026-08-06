package DAY3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(){
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        while(n != 0){
            for(i = 0; i <= 10; i++){
//              int product = n * i;
                System.out.println( n + " " + " x " + " " + i + " " + "=" + " " + n*i);
//            }
        }
    }
}

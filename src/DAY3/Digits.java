package DAY3;

import java.util.Scanner;

public class Digits {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int digit = 0;
        while(n != 0){
            n = n/10;
            digit++;
        }
        System.out.printf("Digits: " + digit);
        }

    }


package DAY3;

import java.util.*;
public class AttemptstoFifty {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        do{
            System.out.print("Enter a number: ");
            n =  sc.nextInt();
            count++;
        }
        while (n != 50);


        System.out.println("Attempts: " + " " + count);


    }
}

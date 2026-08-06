package DAY3;

import java.util.Scanner;

public class Palindrome {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        int rem = 0;
        while(n != 0){
            rem = n%10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        if(original == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}

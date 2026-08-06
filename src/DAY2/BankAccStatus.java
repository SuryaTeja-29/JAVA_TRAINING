package DAY2;

import java.util.Scanner;

public class BankAccStatus {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Balance: ");
        int Amount = sc.nextInt();
        if(Amount >= 1000){
            System.out.println("Account Active");
        }
        else{
            System.out.println("Account Inactive");
        }
    }
}

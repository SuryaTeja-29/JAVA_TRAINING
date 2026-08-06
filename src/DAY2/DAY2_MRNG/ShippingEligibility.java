package DAY2.DAY2_MRNG;

import java.util.*;
public class ShippingEligibility {
    public static void main(){
        int Amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Amount: ");
        Amount = sc.nextInt();
        if(Amount >= 1000){
            System.out.println("Eligible for Free Shipping");
        }
    }
}

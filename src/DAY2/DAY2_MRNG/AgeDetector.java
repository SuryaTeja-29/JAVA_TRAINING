package DAY2.DAY2_MRNG;

import java.util.*;

public class AgeDetector {
    public static void main(){
        int Age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        Age = sc.nextInt();
        if(Age >= 60){
            System.out.println("Eligible for Senior Citizen Discount");
        }
    }
}

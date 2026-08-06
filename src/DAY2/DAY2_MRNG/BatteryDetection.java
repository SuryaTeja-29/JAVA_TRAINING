package DAY2.DAY2_MRNG;

import java.util.*;

public class BatteryDetection {
    public static void main(){
        int Battery;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Battery Percentage: ");
        Battery = sc.nextInt();
        if(Battery < 20){
            System.out.println("Low Battery");
        }
    }
}

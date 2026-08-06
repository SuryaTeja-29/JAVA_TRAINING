package DAY2;

import java.util.*;
public class MaintenanceWEbsite {
    public static void main(){
        boolean Available;
        Scanner sc = new Scanner(System.in);
        System.out.print("Is Website Under Maintenance? (true/false): ");
        Available = sc.nextBoolean();
        if(Available == true){
            System.out.println("Website Available");
        }
        else{
            System.out.println("Service Temporarily Unavailable");
        }
    }
}

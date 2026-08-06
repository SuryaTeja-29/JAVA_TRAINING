package DAY2;

import java.util.Scanner;

public class FlightChekIn {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Arrival Time Before Departure(minutes): ");
        int ArrivalTime = sc.nextInt();
        if(ArrivalTime >= 45){
            System.out.println("Check-In Allowed");
        }
        else{
            System.out.println("Check-In Closed");
        }
    }
}

package DAY2;

import java.util.*;
public class TicketAvailability {
    public static void main(){
        int seats_available;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Available Seats: ");
        seats_available = sc.nextInt();
        if(seats_available != 0){
            System.out.println("Booking Available");
        }
        else {
            System.out.println("House Full");
        }
    }
}

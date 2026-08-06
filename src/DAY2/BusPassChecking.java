package DAY2;
import java.util.*;
public class BusPassChecking {
    public static void main(){
        int Days;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Remaining Days: ");
        Days = sc.nextInt();
        if(Days == 0){
            System.out.println("Bus Pass Expired");
        }
        else{
            System.out.println("Bus Pass Active");
        }
    }
}

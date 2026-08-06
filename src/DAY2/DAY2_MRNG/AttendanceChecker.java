package DAY2.DAY2_MRNG;
import java.util.*;
public class AttendanceChecker {
    public static void main(){
        Float Attendance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Attendance Percentage: ");
        Attendance = sc.nextFloat();
        if(Attendance < 75){
            System.out.println("Attendance Shortage");
        }
    }
}

package DAY2;

import java.util.*;
public class ExamAccess {
    public static void  main(){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter Exam Start Time: ");
        int Start_time = sc.nextInt();
        System.out.print("Enter Login Time: ");
        int Login_time = sc.nextInt();
        if(Start_time >= Login_time){
            System.out.println("Exam Access Granted");
        }
        else{
            System.out.println("Exam Access Denied");
        }
    }
}

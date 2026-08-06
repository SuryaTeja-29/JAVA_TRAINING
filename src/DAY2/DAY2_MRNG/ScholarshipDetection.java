package DAY2.DAY2_MRNG;

import java.util.*;
public class ScholarshipDetection {
    public static void main(){
        int Percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percentage: ");
        Percentage = sc.nextInt();
        if(Percentage > 95){
            System.out.println("Congratulations! You have earned a Merit Scholarship.");
        }
    }
}

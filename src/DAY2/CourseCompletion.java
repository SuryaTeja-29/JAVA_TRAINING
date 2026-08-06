package DAY2;

import java.util.Scanner;

public class CourseCompletion {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Completion Percentage: ");
        int Percentage = sc.nextInt();
        if(Percentage == 100){
            System.out.println("Account Active");
        }
        else{
            System.out.println("Account Inactive");
        }
    }
}

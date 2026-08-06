package DAY2;

import java.util.*;
public class AgeDetection {
    public static void main(){
        int Age;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Age: ");
        Age = sc.nextInt();
        if(Age >= 18){
            System.out.println("Allowed to Watch the Movie");
        }
        else{
            System.out.println("Not Allowed to Watch the Movie");
        }
    }
}

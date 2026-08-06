package DAY2.DAY2_MRNG;

import java.util.*;
public class PasswordStrengthDetection {
    public static void main(){
        int Password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password Length:");
        Password = sc.nextInt();
        if(Password < 8){
            System.out.println("Weak Password");
        }
    }
}

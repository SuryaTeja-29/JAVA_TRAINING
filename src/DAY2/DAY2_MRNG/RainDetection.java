package DAY2.DAY2_MRNG;

import java.util.*;

public class RainDetection {
    public static void main(){
        int Rainfall;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rainfall(mm): ");
        Rainfall = sc.nextInt();
        if(Rainfall > 100){
            System.out.println("Heavy Rain");
        }
    }
}

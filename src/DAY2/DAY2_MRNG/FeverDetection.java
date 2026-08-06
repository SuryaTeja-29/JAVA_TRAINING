package DAY2.DAY2_MRNG;
import java.util.*;
public class FeverDetection {
    public static void main(){
        float Temperature;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        Temperature = sc.nextFloat();
        if(Temperature > 37.5){
            System.out.println("Fever Detected");
        }
        else{
            System.out.println("Fever not Detected");
        }
    }
}

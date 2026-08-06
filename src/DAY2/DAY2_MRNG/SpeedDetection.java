package DAY2.DAY2_MRNG;

import java.util.*;
public class SpeedDetection {
    public static void main() {
        int Speed;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Speed: ");
        Speed = sc.nextInt();
        if (Speed > 80) {
            System.out.println("Overspeeding");
        } else {
            System.out.println("Not OverSpeeding");
        }
    }
}

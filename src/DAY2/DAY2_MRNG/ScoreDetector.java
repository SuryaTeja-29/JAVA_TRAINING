package DAY2.DAY2_MRNG;

import java.util.*;

public class ScoreDetector {
    public static void main(){
        int Score;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score: ");
        Score = sc.nextInt();
        if(Score >= 5000){
            System.out.println("New High Score");
        }
    }
}

package DAY2;

import java.util.Scanner;
public class ScoreDetection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Team A Score: ");
        int Score_A = sc.nextInt();
        System.out.print("Enter Team B Score: ");
        int Score_B = sc.nextInt();
        if(Score_A > Score_B)
            System.out.println("Team A Wins");
        else
            System.out.println("Team B Wins");
    }
}

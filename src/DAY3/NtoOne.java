package DAY3;

import java.util.Scanner;

public class NtoOne {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
}

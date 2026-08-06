package DAY3;

import java.util.Scanner;

public class EventoN {
    public static void main(){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=2; i <= n; i+=2){
            if(n%2 == 0){
            System.out.print(i + " ");
            }
        }
    }
}



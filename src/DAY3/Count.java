package DAY3;

import java.util.*;

public class Count {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Enter Number of Element: ");
        N = sc.nextInt();
        int positive=0;
        int negative = 0;
        int zero = 0;
        System.out.printf("Enter Elements: ");
        for(int i = 1; i <= N; i++){
            int ip = sc.nextInt();
            if(ip > 0){
                positive++;
            } else if (ip < 0) {
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}

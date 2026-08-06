package DAY3;

import java.util.*;
public class SumOfEvenNo {
    public static void main(){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        for(int i=2; i <= n; i+=2){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}

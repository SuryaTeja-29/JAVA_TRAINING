package DAY3;

import java.util.*;
public class PrimeNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
            if(count == 2){
                System.out.println(n + "Is a Prime Number");
            }
            else{
                System.out.println(n + "Is not a Prime Number");
            }

    }
}

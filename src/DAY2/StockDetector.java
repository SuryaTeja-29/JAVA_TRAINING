package DAY2;

import java.util.*;
public class StockDetector {
    public static void main(){
        int Stock;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Quantity: ");
        Stock = sc.nextInt();
        if(Stock > 0){
            System.out.println("Product Available");
        }
        else{
            System.out.println("Out of Stock");
        }
    }
}

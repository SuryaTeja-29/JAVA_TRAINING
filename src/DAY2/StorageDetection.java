package DAY2;

import java.util.Scanner;

public class StorageDetection {
    public static void main(){
        int Storage;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Available Storage(GB): ");
        Storage = sc.nextInt();
        if(Storage<5){
            System.out.println("Storage Almost Full");
        }
    }
}

package DAY2;

import java.util.*;
public class MachineRunning {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Is Machine Running? (true/false):");
        boolean Machine = sc.nextBoolean();
        if(true){
            System.out.println("Production Started");
        }
        else{
            System.out.println("Machine Stopped");
        }
    }
}

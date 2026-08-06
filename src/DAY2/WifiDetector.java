package DAY2;

import java.util.*;
public class WifiDetector {
        public static void main() {
            boolean wifi;
            Scanner sc = new Scanner(System.in);
            System.out.println("Is Wifi Connected? (true/false) ");
            wifi = sc.nextBoolean();
            if (wifi == true) {
                System.out.println("Connected to Internet");
            } else {
                System.out.println("No Internet Connection");
            }
        }
    }

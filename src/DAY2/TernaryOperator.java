package DAY2;
import java.util.Scanner;

//public class TernaryOperator {
//    public static void main(){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int max = (a > b) ? a : b;
//        System.out.println(max);
//    }
//}

//public class TernaryOperator {
//    public static void main(){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max = (a > b) ? (a>c ? a:c) : (b>c ? b:c);
//        System.out.println(max);
//    }
//}

//public class TernaryOperator {
//    public static void main(){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max = (((a>b) ? a:b)>c) ? ((a>b) ? a:b) : c;
//        System.out.println(max);
//    }
//}

public class TernaryOperator {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a>b && a>c) ? a:((b>c) ? b:c);
        System.out.println(max);
    }
}
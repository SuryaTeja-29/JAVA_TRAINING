package DAY2;

public class AssignmentOperators {
    public static void main(){
        int a=5, b=7;
        a = b;
        System.out.println(a);
        System.out.println("Addition: " + (a += b));
        System.out.println("Sub: " + (a -= b));
        System.out.println("Multiplication: " + (a *= b));
        System.out.println("Division: " + (a /= b));
        System.out.println("Modulus: " + (a %= b));
    }
}

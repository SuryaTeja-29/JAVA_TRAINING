package DAY2;

public class Unary {
    public static void main(){
        int a=5, b=7;
        a = ++b;
        a = b++;
        b = --a;
        int c = ++b;
        b = a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

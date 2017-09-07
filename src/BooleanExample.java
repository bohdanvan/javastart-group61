/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x > 20;

        System.out.println(b3); // F

        System.out.println(x > 5); // T
        System.out.println(x < 3); // F
        System.out.println(x >= 9); // T
        System.out.println(x <= 10); // T
        System.out.println(x == 7); // F
        System.out.println(x != 7); // T
    }
}

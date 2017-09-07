/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Java";

        int length = s.length();
        System.out.println(length);

        char c = s.charAt(1);
        System.out.println("c = " + c);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        String lowerCase = s.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);

        boolean startsWithJ = s.startsWith("J");
        System.out.println("startsWithJ = " + startsWithJ);

        boolean equals = s.equals("Java");
        System.out.println("equals = " + equals);

        boolean equalsIgnoreCase = s.equalsIgnoreCase("JAVA");
        System.out.println("equalsIgnoreCase = " + equalsIgnoreCase);

        String reversedString = new StringBuilder(s).reverse().toString();
        System.out.println("reversedString = " + reversedString);
    }
}

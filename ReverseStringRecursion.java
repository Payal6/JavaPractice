public class ReverseStringRecursion {

    static String reverse(String str) {

        if (str.isEmpty()) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
public class InnerReverseStringRecursion {
}
    public static void main(String[] args) {
        String s1 = "Payal";
        System.out.println(reverse(s1));
    }
}

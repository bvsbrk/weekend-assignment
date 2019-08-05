import java.util.Scanner;

class UserMainCodeThirteenth {

    public static String swapPairs(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length(); i += 2) {
            try {
                char cur = builder.charAt(i);
                char next = builder.charAt(i + 1);
                builder.setCharAt(i, next);
                builder.setCharAt(i + 1, cur);
            } catch (Exception e) {
                return builder.toString();
            }
        }
        return builder.toString();
    }
}

public class Thirteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(UserMainCodeThirteenth.swapPairs(s));
    }
}

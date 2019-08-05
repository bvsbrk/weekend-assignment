import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author venbatchu
 *
 */

class UserMainCode {
    static String replacePlus(String str1, String str2) {
        StringBuilder builder = new StringBuilder(str1);
        Set<String> check = new HashSet<>();
        for (int i = 0; i < str2.length(); i++) check.add(str2.charAt(i) + "");
        for (int i = 0; i < str1.length(); i++) {
            String ch = str1.charAt(i) + "";
            if (!check.contains(ch.toLowerCase()) && !check.contains(ch.toUpperCase())) {
                builder.setCharAt(i, '+');
            }
        }
        return builder.toString();
    }
}

public class First {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println(UserMainCode.replacePlus(s1, s2));
    }

}

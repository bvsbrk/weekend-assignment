import java.util.Scanner;

class UserMainCodeSixth {
    static int getAnagram(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        for (int i = 0; i < s2.length(); i++) {
            int idx = sb1.indexOf(s2.charAt(i) + "");
            if (idx >= 0) {
                sb1 = sb1.deleteCharAt(idx);
            }
        }
        System.out.println(sb1);
        return sb1.length() == 0 ? 1 : -1;
    }
}

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(UserMainCodeSixth.getAnagram(s1, s2));
    }
}

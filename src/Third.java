import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserMainCodeThird {
    static int countNoOfWords(String s1, String s2) {
        String secondWord = s2.split(" ")[1];
        int count = 0;
        for (String x : s1.split(" ")) {
            if (x.equals(secondWord)) count += 1;
        }
        return count;
    }
}

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first sentence: ");
        String first = sc.nextLine();
        System.out.print("Enter second sentence: ");
        System.out.println(UserMainCodeThird.countNoOfWords(first, sc.nextLine()));
    }
}

import java.util.Scanner;
import java.util.regex.Pattern;

class UserMainCodeFourteenth {

    public static boolean validatePassword(String s) {
        return Pattern.matches("^(?=.*?[A-Za-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", s);
    }
}

public class Fourteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(UserMainCodeFourteenth.validatePassword(s));
    }
}

import java.util.Scanner;
import java.util.regex.Pattern;

class UserMainCode18 {

    static String validatePAN(String inp) {
        String regex = "^[a-zA-Z]{3}[0-9]{4}[a-zA-Z]$";
        return Pattern.matches(regex, inp) ? "Valid" : "Invalid";
    }
}

public class Eighteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        System.out.println(UserMainCode18.validatePAN(inp));
    }
}

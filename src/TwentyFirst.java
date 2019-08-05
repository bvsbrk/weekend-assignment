import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class UserMainCode21 {

    static String getDay(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return LocalDate.parse(s, formatter).getDayOfWeek().toString();
    }
}
public class TwentyFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(UserMainCode21.getDay(s));
    }
}

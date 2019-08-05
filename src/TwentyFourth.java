import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode24 {

    static int getLastDayOfMonth(String inp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate d = LocalDate.parse(inp, formatter);
        return d.getMonth().length(d.isLeapYear());
    }
}

public class TwentyFourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(UserMainCode24.getLastDayOfMonth(inp));
    }
}

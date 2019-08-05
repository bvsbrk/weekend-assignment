import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode25 {

    static String getAge(String db) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.parse("01/01/2015", formatter);
        LocalDate dob = LocalDate.parse(db, formatter);
        return Period.between(dob, now).getYears() >= 18 ? "eligible" : "not-eligible";
    }
}

public class TwentyFifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dob = sc.nextLine();
        System.out.println(UserMainCode25.getAge(dob));
    }
}

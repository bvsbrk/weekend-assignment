import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode16 {

    static String findOldDate(String d1, String d2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate date1 = LocalDate.parse(d1, formatter);
        LocalDate date2 = LocalDate.parse(d2, formatter);
        return date1.isBefore(date2) ? date1.toString() : date2.toString();
    }
}
public class Sixteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date: ");
        String d1 = sc.next();
        System.out.print("Enter second date: ");
        String d2 = sc.next();
        System.out.println(UserMainCode16.findOldDate(d1, d2));
    }
}

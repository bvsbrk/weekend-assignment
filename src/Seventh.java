import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;

class UserMainCodeSeventh {
    static List<String> retirementEmployeeList(Map<String, String> map) {
        LocalDate now = LocalDate.of(2014, 1, 1);
        List<String> keys = new ArrayList<>(map.keySet());
        for (String emp : keys) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dob = LocalDate.parse(map.get(emp), formatter);
            int years = Period.between(dob, now).getYears();
            if (years < 60) {
                map.remove(emp);
            }
        }
        List<String> al = new ArrayList<>(map.keySet());
        Collections.sort(al);
        return al;
    }
}

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            String id = sc.next();
            System.out.print("Enter dob: ");
            String dob = sc.next();
            map.put(id, dob);
        }
        System.out.println(UserMainCodeSeventh.retirementEmployeeList(map));
    }
}

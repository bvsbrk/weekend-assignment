import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    String firstname;
    String lastname;
    String mobile;
    String email;

    Employee(String firstname, String lastname, String mobile, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.email = email;
    }

    @Override
    public int compareTo(Employee o) {
        return this.firstname.compareTo(o.firstname);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %-30s\n", firstname, lastname, mobile, email);
    }
}

public class TwentyEighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter first name: ");
            String fname = sc.next();
            System.out.print("Enter last name: ");
            String lname = sc.next();
            System.out.print("Enter mobile: ");
            String mob = sc.next();
            System.out.print("Enter email: ");
            String email = sc.next();
            list.add(new Employee(fname, lname, mob, email));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}

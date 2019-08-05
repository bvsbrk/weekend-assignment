import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ThirtyThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        String bin = sc.next();
        System.out.println("Enter octal number");
        String oct = sc.next();
        System.out.println("Enter hexadecimal number");
        String hex = sc.next();
        System.out.println("Integer of binary: " + parseInt(bin, 2));
        System.out.println("Integer of octal: " + parseInt(oct, 8));
        System.out.println("Integer of hexadecimal: " + parseInt(hex, 16));
    }
}

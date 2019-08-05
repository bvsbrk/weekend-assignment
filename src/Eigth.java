import java.util.Scanner;

import static java.lang.Integer.parseInt;

class UserMainCodeEigth {
    static String getKaprekarNumber(int num) {
        String sqr = (num * num) + "";
        int len = sqr.length()/2;
        String first = sqr.substring(0, len);
        String last = sqr.substring(len, sqr.length());
        return parseInt(first) + parseInt(last) == num ? "Kaprekar Number" : "Not Kaprekar";
    }
}
public class Eigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(UserMainCodeEigth.getKaprekarNumber(n));
    }
}

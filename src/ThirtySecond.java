import java.util.Scanner;

public class ThirtySecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        System.out.println("Abs of a: " + Math.abs(a));
        System.out.println("Abs of b: " + Math.abs(b));
        System.out.println(a.equals(b));
    }
}

import java.util.Scanner;

public class ThirtyFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x y and z");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int totalQty = x * 12;
        int totalInvestment = x * y;
        int totalGained = x * 12 * z;
        int profit = totalGained - totalInvestment;
        System.out.format("%.2f", ((float) profit / totalInvestment) * 100);
    }
}

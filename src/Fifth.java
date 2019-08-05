import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserMainCodeFifth {
    static int getAverageOfOdd(Map<Integer, Integer> map) {
        int sum = 0, count = 0;
        for (int x : map.keySet()) {
            if (x % 2 == 1) {
                count += 1;
                sum += map.get(x);
            }
        }
        return sum / count;
    }
}

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter " + (2 * n) + " numbers");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) map.put(sc.nextInt(), sc.nextInt());
        System.out.println(UserMainCodeFifth.getAverageOfOdd(map));
    }
}

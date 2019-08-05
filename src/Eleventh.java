import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

class UserMainCodeEleventh {

    public static String highestScorer(List<String> list) {
        String name = "";
        int max = 0;
        for (String x: list) {
            String[] arr = x.split("-");
            int total = parseInt(arr[1]) +parseInt(arr[2]) + parseInt(arr[3]);
            if (total > max) {
                max = total;
                name = arr[0];
            }
        }
        return name;
    }
}
public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.println(UserMainCodeEleventh.highestScorer(list));
    }
}

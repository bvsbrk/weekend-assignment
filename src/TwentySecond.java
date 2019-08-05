import java.util.*;
import java.util.regex.Pattern;

class UserMainCode22 {

    static List<String> getName(Map<Integer, String> map) {
        String regex = "^[a-z]+[a-zA-Z]{0,}[0-9]+[a-zA-Z]{0,}[A-Z]$";
        List<String> al = new ArrayList<>();
        for (int x : map.keySet()) {
            if (Pattern.matches(regex, map.get(x))) {
                al.add(map.get(x));
            }
        }
        return al;
    }
}

public class TwentySecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), sc.next());
        }
        System.out.println(UserMainCode22.getName(map));
    }
}

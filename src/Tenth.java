import java.util.*;

class UserMainCodeTenth {
    static List<Integer> performSetOperations(List<Integer> list1, List<Integer> list2, char ch) {
        Set<Integer> s = new HashSet<>(list1);
        Set<Integer> s2 = new HashSet<>(list2);
        if (ch == '+') {
            s.addAll(s2);
            return new ArrayList<>(s);
        } else if (ch == '-') {
            s.removeAll(s2);
            return new ArrayList<>(s);
        } else {
            List<Integer> ret = new ArrayList<>();
            for (int x : s) {
                if (s2.contains(x)) ret.add(x);
            }
            return ret;
        }
    }
}

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
            list2.add(sc.nextInt());
        }
        char ch = sc.next().charAt(0);
        System.out.println(UserMainCodeTenth.performSetOperations(list1, list2, ch));
    }
}

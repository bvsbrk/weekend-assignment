import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserMainCodeFourth {
    static List<Integer> generateOddEvenList(List<Integer> list1, List<Integer> list2) {
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            finalList.add(i % 2 == 1 ? list1.get(i) : list2.get(i));
        }
        return finalList;
    }
}

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter " + (2 * n) + " numbers");
        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            list2.add(sc.nextInt());
        }
        System.out.println(UserMainCodeFourth.generateOddEvenList(list1, list2));
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UserMainCodeSecond {
    static int addUniqueEven(int[] arr) {
        Set<Integer> done = new HashSet<>();
        int sum = 0;
        for (int x : arr) {
            if (!done.contains(x) && x % 2 == 0) {
                sum += x;
                done.add(x);
            }
        }
        return sum == 0 ? -1 : sum;
    }
}

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(UserMainCodeSecond.addUniqueEven(arr));
    }
}

import java.util.Scanner;

import static java.lang.Math.abs;

class UserMainCode17 {

    static int findMaxDistance(int[] arr) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (abs(arr[i] - arr[i + 1]) > max) {
                max = abs(arr[i] - arr[i + 1]);
                ans = i;
            }
        }
        return ans + 1;
    }
}

public class Seventeenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(UserMainCode17.findMaxDistance(arr));
    }
}

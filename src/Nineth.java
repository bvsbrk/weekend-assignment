import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class UserMainCodeNineth {
    static String storeMaxVowelWord(String inp) {
        String[] words = inp.split(" ");
        String ans = "";
        int max = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (vowels.contains(words[i].charAt(j))) {
                    count += 1;
                }
            }
            if (count > max) {
                max = count;
                ans = words[i];
            }
        }
        return ans;
    }
}

public class Nineth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(UserMainCodeNineth.storeMaxVowelWord(sc.nextLine()));
    }
}

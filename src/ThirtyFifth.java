import java.util.*;

class Card35 {
    char symbol;
    int number;

    public Card35(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.symbol + " " + this.number;
    }
}

public class ThirtyFifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, List<Card>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter card");
            char ch = sc.next().charAt(0);
            int number = sc.nextInt();
            Card card = new Card(number, ch);
            if (map.containsKey(card.symbol)) {
                map.get(card.symbol).add(card);
            } else {
                List<Card> al = new ArrayList<>();
                al.add(card);
                map.put(card.symbol, al);
            }
        }
        for (char ch : map.keySet()) {
            System.out.println(map.get(ch));
            System.out.println("Number of cards: " + map.get(ch).size());
            int sum = 0;
            for (Card card : map.get(ch)) {
                sum += card.number;
            }
            System.out.println("Sum of cards: " + sum);
        }
    }
}

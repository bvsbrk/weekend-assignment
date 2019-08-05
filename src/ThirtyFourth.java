import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirtyFourth {
    public static void main(String[] args) {
        String choiceStr = "1. Insert\n" +
                "2. Search\n" +
                "3. Delete\n" +
                "4. Display\n" +
                "5. Exit\n";
        Scanner sc = new Scanner(System.in);
        System.out.println(choiceStr);
        int choice = sc.nextInt();
        List<String> al = new ArrayList<>();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Enter item to be inserted");
                    al.add(sc.next());
                    break;
                case 2:
                    System.out.println("Enter item to search");
                    System.out.println(al.indexOf(sc.next()) > 0 ? "Item found" : "Item not found");
                    break;
                case 3:
                    System.out.println("Enter item to delete");
                    String item = sc.next();
                    int idx = al.indexOf(item);
                    if (idx > 0) {
                        al.remove(idx);
                        System.out.println("Deleted successfully");
                    } else System.out.println("Item not found");
                    break;
                case 4:
                    System.out.println(al);
                    break;
                default:
                    System.exit(0);
            }
            System.out.println(choiceStr);
            choice = sc.nextInt();
        }
    }
}

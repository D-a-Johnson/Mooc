
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        
            String[] parts = input.split(",");
            if (Integer.valueOf(parts[1]) > age) {
                name = parts[0];
                age = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}


import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String word = scanner.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double number2 = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean test = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + word);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + number2);
        System.out.println("You gave the boolean " + test);
    }
}

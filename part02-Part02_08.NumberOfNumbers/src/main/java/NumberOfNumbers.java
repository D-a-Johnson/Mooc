
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == 0){
                System.out.println("Number of numbers: " + sum);
                break;
            } 
            sum++;
        }
    }
}

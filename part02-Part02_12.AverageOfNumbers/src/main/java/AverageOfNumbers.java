
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == 0){
                Double average = ((1.0 *sum)/(num * 1.0));
                System.out.println("Average of the numbers: " + average);
                break;
            } 
            sum += answer;
            num ++;
        }
    }
}

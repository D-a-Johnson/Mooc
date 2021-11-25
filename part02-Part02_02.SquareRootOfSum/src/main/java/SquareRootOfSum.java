
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        num += Integer.valueOf(scanner.nextLine());
        double sqR = Math.sqrt(num);
        System.out.println(sqR);
    }
}

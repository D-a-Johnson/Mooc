
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String row = scanner.nextLine();
        try (Scanner dataScan = new Scanner(Paths.get(row))) {
            while (dataScan.hasNextLine()){
                row = dataScan.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        int found = 0;
        try (Scanner dataScan = new Scanner(Paths.get(file))){
            System.out.println("Search for:");
            String name = scanner.nextLine();
            while (dataScan.hasNextLine()){
                if (name.equals(dataScan.nextLine())){
                    found = 1;
                    break;
                }
            }
            if (found == 1) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        } 
    }
}

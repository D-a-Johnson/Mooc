
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scan.nextLine();
        int count = 0, wins = 0, loss = 0;
        try (Scanner dataScan = new Scanner(Paths.get(file))){
            System.out.println("Team: ");
            String search = scan.nextLine();
            while (dataScan.hasNextLine()){
                String line = dataScan.nextLine();
                String parts [] = line.split(",");
                if (parts[0].equals(search)){
                    count++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                        wins++;
                    } else {
                        loss++;
                    }
                } else if (parts[1].equals(search)){
                    count++;
                    if (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])){
                        wins++;
                    } else {
                        loss++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loss);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        } 
    }

}

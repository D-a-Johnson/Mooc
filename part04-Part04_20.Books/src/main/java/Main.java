import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, pubYear));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        System.out.println("");
        for (Book book : books){
            switch (answer) {
                case "everything":
                System.out.println(book);
                break;
                case "name":
                System.out.println(book.getTitle());
                break;
            }
        } 
    }
}

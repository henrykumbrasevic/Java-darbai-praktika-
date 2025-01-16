import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Books> arrayOfBooks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int bookCounter = 0;


        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            bookCounter++;
            Books books = new Books(bookName, age);
            arrayOfBooks.add(books);
            Collections.sort(arrayOfBooks);
        }
        System.out.println(bookCounter + " books in total");
        System.out.println("Books: ");
        for (Books book : arrayOfBooks) {
            System.out.println(book);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Books> arrayOfBooks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int counter = 0;


        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            counter++;

            if (bookName.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());

            Books books = new Books(bookName, age);
            arrayOfBooks.add(books);
        }
        System.out.println(counter-1 + " books in total");
        System.out.println("Books: ");
        for (Books book : arrayOfBooks) {
            System.out.println(book);
        }


    }
}

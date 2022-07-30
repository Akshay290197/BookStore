import java.lang.Exception;
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BookDetails b = new BookDetails();
        String s = "D:\\Java NIIT Projects\\BookStore\\Book1.csv";

            int count = b.countLine(s);

        BookInfo[] book = b.readFromFile(count,s);
        b.display(book);

        // taking input from user
        try {
            System.out.println("Enter which book name you want to purchase : ");
            String bo = sc.next();
            b.displayChoice(book, bo);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

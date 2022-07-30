import java.io.*;
public class BookDetails {
    CalculateDiscount c = new CalculateDiscount();
    public int countLine(String file) throws Exception
    {
        int count = 0;
        int i=0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((br.readLine())!=null)
        {
            if(i==0)
            {
                i++;
                continue;
            }
            count++;
        }
        return count;
    }

    // storing the details in array
    BookInfo[] readFromFile(int count, String file)
    {
        BookInfo[] book = new BookInfo[count];
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            int i=0;
            int j=0;
            while((str=br.readLine())!=null)
            {
                if(i==0)
                {
                    i++;
                    continue;
                }
                else {
                    str = str.replaceAll(" ", "");
                    String[] s = str.split(",");
                    book[j] = new BookInfo(s[0], s[1], s[2], Double.parseDouble(s[3]));
                    j++;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return book;
    }

    public void display(BookInfo[] book)
    {
        System.out.format("%-40s %-40s %-40s %-40s", "Book Name", "Author Name", "genre", "Price");
        System.out.println();
        for(BookInfo b : book)
        {
            System.out.println(b);
        }
    }

    public void displayChoice(BookInfo[] book, String choice)
    {
        System.out.format("%-40s %-40s %-40s %-40s", "Book Name", "Author Name", "genre", "Price");
        System.out.println();
        for(BookInfo boo : book)
        {
            if(boo.getBookName().equalsIgnoreCase(choice))
            {
                System.out.println(boo);
                double price = boo.getPrice()-(c.discountCalculate(boo));
                System.out.println("You have to pay : " + price);
            }
        }
    }
}

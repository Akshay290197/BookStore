public class CalculateDiscount {
    BookInfo book;
    double calculateDiscount=0;

    public double discountCalculate(BookInfo book)
    {
        if(book.getGenre().equalsIgnoreCase("FICTION"))
        {
            calculateDiscount = book.getPrice()*0.25;
        }
        return calculateDiscount;
    }
}

public class BookInfo {
    private String bookName;
    private String authorName;
    private String genre;
    private double price;

    public BookInfo(String bookName, String authorName, String genre, double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.format("%-40s %-40s %-40s %-40s",bookName,authorName,genre,price);
        return "";
    }
}

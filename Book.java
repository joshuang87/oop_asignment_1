public class Book {

    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(String title,String author,double price,int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // @Override
    // public String toString() {
    //     return "Title : " + title + "\nAuthor : " + author + "\nPrice : RM " + price + "\nQuantity : " + quantity;
    // }
}

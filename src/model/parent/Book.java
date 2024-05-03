package model.parent;

public abstract class Book {
    private String bookID;
    private String title;
    private String author;
    private double bookPrice;
    public Book(String bookID, String title, String author, double bookPrice) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.bookPrice = bookPrice;
    }
    



    
    public Book() {
    }





    public String getBookID() {
        return bookID;
    }
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    
    
}

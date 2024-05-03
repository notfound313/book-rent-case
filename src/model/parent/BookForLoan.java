package model.parent;

import interfaces.PriceLoanInterface;

public abstract class BookForLoan extends Book implements PriceLoanInterface {
    private double bookLoanPrice;
    private int stock;
    public BookForLoan(String bookID, String title, String author, double bookPrice, int stock) {
        super(bookID, title, author, bookPrice);        
        this.stock = stock;
        
    }


    public BookForLoan() {    }

    
    

    public double getBookLoanPrice() {
        return bookLoanPrice;
    }

    public void setBookLoanPrice(double bookLoanPrice) {
        this.bookLoanPrice = bookLoanPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
    
}

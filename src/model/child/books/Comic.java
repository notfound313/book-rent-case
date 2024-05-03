package model.child.books;


import model.parent.BookForLoan;

public class Comic extends BookForLoan{
    
    private String genre;
    public Comic(String bookID, String title, String author, double bookPrice, int stock,
            String genre) {
        super(bookID, title, author, bookPrice,stock);        
        this.genre = genre;
    }
    


@Override
public void calculateLoanPrice() {
    // TODO Auto-generated method stub
   
    int idx;
    double loanPrice;

    if(getStock()>= 10){
        idx = 0;
    }else{
        idx= 1;
    }
    loanPrice = (PRESENTASE_STOCK[idx]+PRESENTASE_COMIC)*getBookPrice();
    setBookLoanPrice(loanPrice);
    
}



public String getGenre() {
    return genre;
}

public void setGenre(String genre) {
    this.genre = genre;
}



}

package model.child.books;


import model.parent.BookForLoan;

public class Novel extends BookForLoan {    
    private boolean isAseries;
    public Novel(String bookID, String title, String author, double bookPrice, int stock,
            boolean isAseries) {
        super(bookID, title, author, bookPrice,stock);        
        this.isAseries = isAseries;
        calculateLoanPrice();
    }
    public Novel(){
        
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
        loanPrice = (PRESENTASE_STOCK[idx]+PRESENTASE_NOVEL)*getBookPrice();
        setBookLoanPrice(loanPrice); 
    }

    
    public boolean isAseries() {
        return isAseries;
    }

    public void setAseries(boolean isAseries) {
        this.isAseries = isAseries;
    }

    
    

    
}

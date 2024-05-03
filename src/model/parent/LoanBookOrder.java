package model.parent;

import interfaces.FeeLoanInterface;

public class LoanBookOrder implements FeeLoanInterface {
    private String loadId;
    private Member member;
    private BookForLoan loanBook;
    private int loanDuration;
    private double loanFee;
    public LoanBookOrder(String loadId, Member member,BookForLoan loanBook, int loanDuration) {
        this.loadId = loadId;
        this.member = member;
        this.loanBook = loanBook;
        this.loanDuration = loanDuration;
        calculateLoanFee();
    }

    public LoanBookOrder() {
    }

    @Override
    public void calculateLoanFee() {
        // TODO Auto-generated method stub
        setLoanFee(getLoanDuration()* getLoanBook().getBookLoanPrice());
    }

    

    public String getLoadId() {
        return loadId;
    }
    public void setLoadId(String loadId) {
        this.loadId = loadId;
    }
    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public int getLoanDuration() {
        return loanDuration;
    }
    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }
    public double getLoanFee() {
        return loanFee;
    }
    public void setLoanFee(double loanFee) {
        this.loanFee = loanFee;
    }

    public BookForLoan getLoanBook() {
        return loanBook;
    }

    public void setLoanBook(BookForLoan loanBook) {
        this.loanBook = loanBook;
    }

    
}

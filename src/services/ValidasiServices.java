package services;

import java.util.List;

import model.parent.BookForLoan;
import model.parent.LoanBookOrder;
import model.parent.Member;

public class ValidasiServices {

    public boolean validasiMemberId(List<Member> memberList, String memberId){
        boolean status=false;
        for (Member member : memberList) {
            if(member.getMemberId().contains(memberId)){
                status=true;
            }
            
        }
        return status;
        

    }

    public boolean validasiBookId(List<BookForLoan> bookList, String bookId){
        boolean status=false;
        for (BookForLoan book : bookList) {
            if(book.getBookID().contains(bookId)){
                status=true;
            }
            
        }
        return status;
        

    }
    public boolean validasiBookLoanOrder(List<LoanBookOrder> bookOrderList, String bookOrderId){
        boolean status=false;
        for (LoanBookOrder book : bookOrderList) {
            if(book.getLoadId().contains(bookOrderId)){
                status=true;
            }
            
        }
        return status;
        

    }
    public boolean validasiNumber(String number){
        String regexNumber = "^[0-9]+$";
        boolean isNumber = number.matches(regexNumber);
        return isNumber;

    }
}

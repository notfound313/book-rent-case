package services;

import java.util.List;

import model.child.member.LoanMember;
import model.parent.BookForLoan;
import model.parent.LoanBookOrder;
import model.parent.Member;

public class MenuFiturService {
    public void getAllBookLoan(List<BookForLoan> bookLoan){

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %40s %20s %10s ", "Book Id", "Title", "Author", "Stock");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(BookForLoan book: bookLoan){
            System.out.format("%-10s %-40s %-20s %-10d",
                    book.getBookID(), book.getTitle(), book.getAuthor(), book.getStock());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");


    }

    public void loanBook(List<LoanBookOrder> listLoanBookOrder,List<BookForLoan> bookLoan, List<Member> memberList, String reqMember, String reqBookid, int lamaPeminjaman){
        
        Member memberloan = new LoanMember();
          

        for (Member member : memberList) {
            if(member.getMemberId().contains(reqMember)){
                memberloan = member;
            }
            
        }

        String loanId = genereteId(listLoanBookOrder);
        /*
         * Pas set harga loan book nantinya price book loan nya sama semua tapi untuk hasil fee nya bener
         */

        for (BookForLoan book : bookLoan) {
            if(book.getBookID().contains(reqBookid)){                                              
                LoanBookOrder loanBookOrder = new LoanBookOrder(loanId,memberloan, book, lamaPeminjaman);
                listLoanBookOrder.add(loanBookOrder); 
                             
                if(book.getStock() <= 9  ){
                    book.calculateLoanPrice();
                }
                book.setStock(book.getStock()-1);
                book.calculateLoanPrice();               
                
                System.out.println(loanBookOrder.getLoadId());
                System.out.println("Loan Success..");
            }
            
        }
        

    }

    public void returnBook(List<LoanBookOrder> loanBookOrders, String loanId){
        int idx = 0;
        for (int i = 0; i < loanBookOrders.size(); i++) {
            if(loanBookOrders.get(i).getLoadId().contains(loanId)){
                idx=i;
                loanBookOrders.get(i).getLoanBook().setStock(loanBookOrders.get(i).getLoanBook().getStock()+1);
                loanBookOrders.get(i).getLoanBook().calculateLoanPrice();
            }
                       
            
        }
        loanBookOrders.remove(idx);
        System.out.println("Return book Success");

    }

    public void getAllBookOrder(List<LoanBookOrder> loanBookOrders){

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-40s %-10s %-10s %-10s", "Loan Id", "Member Name", "Book Id", "Title", "Loan Book Price", "Loan Duration", "Loan Fee");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for(LoanBookOrder book: loanBookOrders){
            System.out.format("%-10s %-10s %-10s %-40s %-10d %-10d %-10d",
                    book.getLoadId(), book.getMember().getMemberName(), book.getLoanBook().getBookID(),
                    book.getLoanBook().getTitle(), (int)book.getLoanBook().getBookLoanPrice(), book.getLoanDuration(),(int) book.getLoanFee());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        

        


    }

    public void exitAppilication(){
        System.out.println("----------------------------------");
        System.out.println("Terima kasih atas kunjunganya... :)");
        System.out.println("    O                   O         ");
        System.out.println("----------------------------------");

    }

    public static String genereteId(List<LoanBookOrder> listLoanBookOrder){
        String loanId ="Ord-";
        int idNum = 1;
        int idInt;

        if(listLoanBookOrder.size()==0){
            loanId +="001";
        }else{
            for (LoanBookOrder loanBook : listLoanBookOrder) {
                idInt=Integer.parseInt(loanBook.getLoadId().charAt(5)+""+loanBook.getLoadId().charAt(6));
                if(idNum==idInt){
                    idNum+=1;                    
                }               
                
            }          
            if(listLoanBookOrder.size() < 9){               
                loanId +="00"+String.valueOf(idNum);
            }else{                
                loanId +="0"+String.valueOf(idNum);

            }
           
        }

        return loanId;

    }
    
}

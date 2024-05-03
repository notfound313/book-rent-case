package services;

import java.util.List;


import model.parent.BookForLoan;
import model.parent.LoanBookOrder;
import model.parent.Member;
import repository.RepositoryBookForLoan;
import repository.RepositoryLoanOrder;
import repository.RepositoryMember;

public class MainMenuServices {


    public void startMainMenuServices(){

        
        RepositoryBookForLoan repositoryBookForLoan = new RepositoryBookForLoan();
        List<BookForLoan> bookForLoans = repositoryBookForLoan.getAllBookForLoan();
        RepositoryLoanOrder loanOrder = new RepositoryLoanOrder();
        List<LoanBookOrder> loanBookOrders = loanOrder.getAllListOrder();
        RepositoryMember allMember = new RepositoryMember();
        List<Member> listMember = allMember.getAllMemeber();
        MenuFiturService menuService = new MenuFiturService();
        InputDataServices inputData = new InputDataServices();
        int option;
      
        


    do{
        System.out.println("-----------------------------");
        System.out.println("Main Menu");
        System.out.println("1. Data All Book For Loan");
        System.out.println("2. Loan");
        System.out.println("3. Return");
        System.out.println("4. Data All Loan Book Order");
        System.out.println("0. Exit");
        option = inputData.inputIsNumber();
        switch (option) {
            case 1:
                menuService.getAllBookLoan(bookForLoans);
                break;
            case 2:
                menuService.getAllBookLoan(bookForLoans);               
                String reqMemberId = inputData.requestMemberId(listMember);                
                String reqBookId = inputData.requestBookId(bookForLoans);                
                int reqLamaPinjam = inputData.lamaPeminjaman();
                menuService.loanBook(loanBookOrders,bookForLoans, listMember, reqMemberId, reqBookId, reqLamaPinjam);
                break;
            case 3:
                menuService.getAllBookOrder(loanBookOrders);                
                String reqLoanId = inputData.requestBookOrderId(loanBookOrders);
                menuService.returnBook(loanBookOrders, reqLoanId);
                break;
            case 4:
                menuService.getAllBookOrder(loanBookOrders);
                break;        
            default:
                menuService.exitAppilication();
                break;
        }

    }while(option != 0);

    }

    
    

}

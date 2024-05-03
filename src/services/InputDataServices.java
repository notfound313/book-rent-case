package services;

import java.util.List;
import java.util.Scanner;

import model.parent.BookForLoan;
import model.parent.LoanBookOrder;
import model.parent.Member;

public class InputDataServices {
    ValidasiServices validasi = new ValidasiServices();

    public String requestMemberId(List<Member> memberList){
        boolean valreq;
        String memberId;
        
        do{
            System.out.println("Masukan Member ID");
            memberId = inputScanner();
            valreq = validasi.validasiMemberId(memberList, memberId);
            if(!valreq){
                System.out.println("Member id tidak ditemukan mohon ulangi");
            }
        }while(!valreq);

        return memberId;      

        

    }

    public String requestBookId(List<BookForLoan> bookLoanList){
        boolean valreq;
        String bookId;
        
        do{
            System.out.println("Masukan Book ID");
            bookId = inputScanner();
            valreq = validasi.validasiBookId(bookLoanList, bookId);
            if(!valreq){
                System.out.println("Book id tidak ditemukan mohon ulangi");
            }
        }while(!valreq);

        return bookId;
    }

    public String requestBookOrderId(List<LoanBookOrder> loanBookOrders){
        boolean valreq;
        String bookOrderId;
        
        do{
            System.out.println("Masukan Book loan order ID");
            bookOrderId = inputScanner();
            valreq = validasi.validasiBookLoanOrder(loanBookOrders, bookOrderId);
            if(!valreq){
                System.out.println("Book loan order ID tidak ditemukan mohon ulangi");
            }
        }while(!valreq);

        return bookOrderId;
    }

    public int lamaPeminjaman(){
        boolean valreq;
        String lamaPinjam;        
        
        do{
            System.out.println("Masukan Berapa lama Meminjam");
            lamaPinjam = inputScanner();
            valreq = validasi.validasiNumber(lamaPinjam);
            if(!valreq){
                System.out.println("Hanya menerima nilai number");
            }
        }while(!valreq);

        

        return Integer.parseInt(lamaPinjam);
    }
    public int inputIsNumber(){
        boolean valreq;
        String number;        
        
        do{
            System.out.println("Masukan Berapa lama Meminjam");
            number = inputScanner();
            valreq = validasi.validasiNumber(number);
            if(!valreq){
                System.out.println("Hanya menerima nilai number");
            }
        }while(!valreq);

        

        return Integer.parseInt(number);
    }

    public  String inputScanner(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String inp = input.nextLine();
        return inp;
        

    }


    
}

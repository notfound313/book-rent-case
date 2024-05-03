package repository;

import java.util.ArrayList;
import java.util.List;

import model.child.books.Comic;
import model.child.books.Novel;
import model.parent.BookForLoan;


public class RepositoryBookForLoan {

    public  List<BookForLoan> getAllBookForLoan(){
        List<BookForLoan> allBookForLoan = new ArrayList<>();
        
        BookForLoan comic1  = new Comic("Comic-001", "Uzumaki Naruto", "Mamashi Kisimoto", 55000, 10, "Shounen");
        BookForLoan comic2  = new Comic("Comic-002", "The Worst Client", "Mamashi Kisimoto", 35000, 20, "Shounen");
        BookForLoan comic3  = new Comic("Comic-003", "For the Sake of Dreams...!!", "Mamashi Kisimoto", 35000, 15, "Shounen");
        BookForLoan comic4  = new Comic("Comic-004", "Hunter X Hunter : The Day of Departure", "Yoshiro Togashi", 50000, 15, "Fantasy");
        BookForLoan comic5  = new Comic("Comic-005", "Hunter X Hunter : A Struggle in the Mist", "Yoshiro Togashi", 80000, 25, "Fantasy");

        BookForLoan novel1 = new Novel("Novel-001", "Harry Potter and the Philosopher's Stone", "J.K Rowling", 150000, 10, true);
        BookForLoan novel2 = new Novel("Novel-002", "Harry Potter and the Chamber of Secrets", "J.K Rowling", 150000, 10, true);
        BookForLoan novel3 = new Novel("Novel-003", "Harry Potter and the Prisoner of Azkaban", "J.K Rowling", 200000, 15, true);
        BookForLoan novel4 = new Novel("Novel-004","Ayah Aku Berbeda", "Tere Liye", 35000, 15, false);
        BookForLoan novel5 = new Novel("Novel-005", "Madre", "Dea Lestari", 80000, 10, false);

      
        allBookForLoan.add(comic1);
        allBookForLoan.add(comic2);
        allBookForLoan.add(comic3);
        allBookForLoan.add(comic4);
        allBookForLoan.add(comic5);

        allBookForLoan.add(novel1);
        allBookForLoan.add(novel2);
        allBookForLoan.add(novel3);
        allBookForLoan.add(novel4);
        allBookForLoan.add(novel5);

        return allBookForLoan;

    
    }
    
}

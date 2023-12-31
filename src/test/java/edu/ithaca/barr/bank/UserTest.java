package edu.ithaca.barr.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;


public class UserTest{
    @Test
    void checkOutBookTest(){
        Library testLibrary = new Library();
        //Equivalence partition - book does not exist in library
        User testUser = new User("123", "password");
        assertThrows(NoSuchElementException.class, ()-> testUser.checkOutBook("book", testLibrary));


        //Equivalence partition - book exists in library
        //Integration Test - Classes work together in checkOutBook method
        //Adding books based on my model is done by the admin, but for the purpose of this test I will be adding manually
        Book testBook = new Book("TestBook", "Max Braithwaite");
        testLibrary.books.add(testBook);
        testUser.checkOutBook("TestBook", testLibrary);
        assertEquals(testUser.getCurrentBooks().get(0), testBook);
        
        //Equivalence partition - book is already checked out
        User testUser2 = new User("123", "password");
        Book testBook2 = new Book("TestBook2", "John Barr");
        testLibrary.books.add(testBook2);
        testUser2.checkOutBook("TestBook2", testLibrary);
        assertThrows(NoSuchElementException.class, ()-> testUser.checkOutBook("TestBook2", testLibrary));

        //Equivalence partition - 2 books already checked out
        Book testBook3 = new Book("TestBook3", "Ali Erkan");
        Book testBook4 = new Book("TestBook4", "Toby Dragon");
        testLibrary.books.add(testBook3);
        testLibrary.books.add(testBook4);
        testUser.checkOutBook("TestBook3", testLibrary);
        assertThrows(IllegalArgumentException.class, ()-> testUser.checkOutBook("TestBook4", testLibrary));
        




    }
}


package edu.ithaca.barr.bank;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class User {
    //User class
    private boolean isFrozen;
    private ArrayList<Book> currentBooks;
    private String id;
    private String password;

    public User(String id, String password){
        isFrozen = false;
        currentBooks = new ArrayList<Book>();
        this.id = id;
        this.password = password;
    }


    /**
     * @post creates and returns arrayList of books currently checked out
     * @return ArrayList of books checked out
     */
    ArrayList booksCheckedOut(){
        return null;
    }

    /**
     * @post checks out book to account
     * @param bookName - name of book to check out of library
     * @param library - library to checkout book from
     * @throws NoSuchElementException if the limit of books checked out is reached
     */
    void checkOutBook(String bookName, Library library){
        for(int i=0; i<library.books.size(); i++){
            if(library.books.get(i).getBookName() == bookName){
                this.currentBooks.add(library.books.get(i));
                library.checkedOutBooks.add(library.books.get(i));
                library.books.remove(library.books.get(i));
            }
        }
        if(currentBooks.size()>2){
            library.checkedOutBooks.remove(currentBooks.get(2));
            library.books.add(currentBooks.get(2));
            currentBooks.remove(2);
            throw new IllegalArgumentException("Book checkout limit reached");
        }
        int count=0;
        for(int i=0; i<currentBooks.size(); i++){
            if(currentBooks.get(i).getBookName() == bookName){
                count+=1;
            }
        }
        if(count==0){
            throw new NoSuchElementException("Book not available");
        }
        
    }

    /**
     * @post returns book that is currently checked out
     * @param bookName - name of book to return
     * @throws NoSuchelementException if book is not checked out by account
     */
    void returnBook(String bookName){
    }

    /**
     * @post returns list of all books written by author inputted
     * @param author - name of author
     * @return ArrayList of books written by searched author
     */
    ArrayList searchByAuthor(String author){
        return null;
    }

    /**
     * @post return book object if match is found
     * @param bookName - name of book to search
     * @return book object with the inputted name
     */
    Book searchByBookName(String bookName){
        return null;
    }

    ArrayList getCurrentBooks(){
        return currentBooks;
    }


    
}

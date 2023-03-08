package edu.ithaca.barr.bank;

import java.util.ArrayList;

public class User {
    //User class
    private boolean isFrozen;
    private ArrayList currentBooks;
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
     * @throws NullReferenceException if the limit of books checked out is reached
     */
    void checkOutBook(String bookName){
    }

    /**
     * @post returns book that is currently checked out
     * @param bookName - name of book to return
     * @throws NullReferenceException if book is not checked out by account
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
        return null;
    }


    
}

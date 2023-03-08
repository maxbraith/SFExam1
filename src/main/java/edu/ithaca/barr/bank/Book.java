package edu.ithaca.barr.bank;

public class Book {
    private String bookName;
    private String author;
    private String dateToReturn;
    private User account;

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
        this.dateToReturn = null;
        this.account = null;
    }

    public String getBookName(){
        return bookName;
    }

    public String getAuthor(){
        return author;
    }

    public String getDate(){
        return dateToReturn;
    }

    public User getAccount(){
        return account;
    }
    
}

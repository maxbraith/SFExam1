package edu.ithaca.barr.bank;

import java.util.ArrayList;

public class Library {
    private ArrayList<User> users;
    private ArrayList<User> frozenUsers;
    private ArrayList librarians;
    private ArrayList admins;
    public ArrayList<Book> books;
    public ArrayList<Book> checkedOutBooks;

    public Library(){
        users = new ArrayList<User>();
        frozenUsers = new ArrayList<User>();
        librarians = null;
        admins = null;
        books = new ArrayList<Book>();
        checkedOutBooks = new ArrayList<Book>();

    }

    /**
     * @post confirms credentials of admin
     * @param id - id associated with account
     * @param passow0rd - password associated with account
     * @return true if account exists, false if not
     */
    public boolean adminLogIn(String id, String password){
        return false;
    }

    /**
     * @post confirms credentials of librarian
     * @param id - id associated with account
     * @param passoword - password associated with account
     * @return true if account exists, false if not
     */
    public boolean librarianLogIn(String id, String password){
        return false;
    }

    /**
     * @post confirms credentials of user
     * @param id - id associated with account
     * @param passoword - password associated with account
     * @return true if account exists, false if not
     */
    public boolean userLogIn(String id, String password){
        return false;
    }

    public void createAccount(User userToCreate){
        users.add(userToCreate);
    }

    
}

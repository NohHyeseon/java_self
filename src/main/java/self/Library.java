package self;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<Book>();
    }
    public void addBook(Book book){
        bookList.add(book);
    }
    public void removeBook(int isbn){
        Book bookToremove = FindBookByIsbn(isbn);
        if(bookToremove!=null){
            bookList.remove(bookToremove);
        }
    }

    public Book FindBookByIsbn(int isbn){
        for(Book book : bookList){
            if(book.getIsbn()==isbn){
                return book;
            }
        }
        return null;
    }
    public void listBooks(){
        for(Book book : bookList){
            System.out.println(book);
        }
    }



}



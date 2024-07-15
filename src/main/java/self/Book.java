package self;

public class Book {
    private String title;
    private String author;
    private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", isbn=" + isbn + '}';
    }

}
//책 이름 저자 고유번호 가 인스턴스 각 해당하는 생성자 만들어주고
//getter 만들어dd주기
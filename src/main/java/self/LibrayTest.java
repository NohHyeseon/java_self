package self;

public class LibrayTest {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("king","ddd",1));
        lib.addBook(new Book("zzz","ddd",2));
        lib.addBook(new Book("kddd","ddd",3));


        System.out.println("all book in the library:");
        lib.listBooks();

        System.out.println("remove book");
        lib.removeBook(3);

        lib.listBooks();


        Book book = lib.FindBookByIsbn(3);
        if(book != null) {
            System.out.println("book: " + book);
        }else System.out.println("book not found");


    }

}

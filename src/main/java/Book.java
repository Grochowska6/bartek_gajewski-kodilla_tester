
public class Book {

    private String author = "Isaac Asimov";


    private String title = "The Galaxy";

 public Book(String title, String author) {
     this.title = title;
     this.author = author;


        Book book = new Book("Isaac Asimov","The Galaxy");
        System.out.println(book.author + " " + book. title);

    }
    public static Book of(String author, String title) {
        return new Book(author, title);
        Book book = Book.of("Isaac Asimov","The Galaxy");
        System.out.println(book);
    }

}

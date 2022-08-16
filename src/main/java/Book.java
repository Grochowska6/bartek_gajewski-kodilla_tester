
public class Book {

    private String author;


    private String title;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public static Book of(String author, String title) {
        return new Book(author, title);

    }

}

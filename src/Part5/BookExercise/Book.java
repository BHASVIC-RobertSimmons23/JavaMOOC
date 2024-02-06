package Part5.BookExercise;

public class Book {
    String author;
    String name;
    int pages;
    public Book(String givenAuthor, String givenName, int givenPages) {
        author = givenAuthor;
        name = givenName;
        pages = givenPages;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}

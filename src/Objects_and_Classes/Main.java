package Objects_and_Classes;
import Objects_and_Classes.Author;
import Objects_and_Classes.Book;
public class Main {
    public static void main(String[] args) {
        Book dandelionWine = new Book("Dandelion Wine", 1957);
        System.out.println("book.title = " + dandelionWine.getTitle());
        Author name = new Author("Ray", "Bradbury");
        System.out.println("name.authorName + name.authorSurname = " + name.getAuthorName() + " " + name.getAuthorSurname());
        System.out.println("book.releaseDate = " + dandelionWine.releaseDate);

        Book contact = new Book("Contact", 1986);
        System.out.println("contact.title = " + contact.getTitle());
        Author name1 = new Author("Carl", "Sagan");
        System.out.println("name1.authorName + name1.authorSurname = " + name1.getAuthorName() + " " + name1.getAuthorSurname());
        System.out.println("book.releaseDate = " + contact.releaseDate);
        contact.setReleaseDate(1985);
        System.out.println("contact.releaseDate = " + contact.releaseDate);
    }
}
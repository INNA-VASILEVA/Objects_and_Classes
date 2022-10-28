package Objects_and_Classes;
import Objects_and_Classes.Author;
import Objects_and_Classes.Book;
public class Main {
    public static void main(String[] args) {
        Author name = new Author("Ray", "Bradbury");
        Book dandelionWine = new Book("Dandelion Wine", name, 1957);
        System.out.println("book.title = " + dandelionWine.getTitle());
        System.out.println("name.authorName + name.authorSurname = " + name.getAuthorName() + " " + name.getAuthorSurname());
        System.out.println("book.releaseDate = " + dandelionWine.releaseDate);

        Author name1 = new Author("Carl", "Sagan");
        Book contact = new Book("Contact", name1, 1986);
        System.out.println("contact.title = " + contact.getTitle());
        System.out.println("name1.authorName + name1.authorSurname = " + name1.getAuthorName() + " " + name1.getAuthorSurname());
        System.out.println("book.releaseDate = " + contact.releaseDate);

        contact.setReleaseDate(1985);
        System.out.println("contact.releaseDate = " + contact.releaseDate);


        System.out.println(name);
        System.out.println(name1);
        System.out.println(dandelionWine);
        System.out.println(contact);

        System.out.println(name.equals(name1));
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        System.out.println(dandelionWine.equals(contact));
        System.out.println(dandelionWine.hashCode());
        System.out.println(contact.hashCode());

    }
}
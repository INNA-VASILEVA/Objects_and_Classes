package Objects_and_Classes;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author name;
    public int releaseDate;
    public Book (String title, Author name, int releaseDate){
        this.title = title;
        this.name = name;
        this.releaseDate = releaseDate;
    }
    public String getTitle() {
        return this.title;
    }
    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", name=" + name +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseDate == book.releaseDate && title.equals(book.title) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, name, releaseDate);
    }
}

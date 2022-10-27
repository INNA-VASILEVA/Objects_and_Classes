package Objects_and_Classes;

public class Book {
    private final String title;
    public static int releaseDate;
    public Author name;

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
}

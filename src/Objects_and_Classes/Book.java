package Objects_and_Classes;

public class Book {
    String title;
    int releaseDate;

    public Book (String title, int releaseDate){
        this.title = title;
        this.releaseDate = releaseDate;
    }
    public String getTitle() {
        return this.title;
    }
    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }
}

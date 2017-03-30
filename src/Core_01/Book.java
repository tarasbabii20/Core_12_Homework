package Core_01;


/**
 * Created by Taras on 30.03.2017.
 */
public class Book{

    private String name;
    private int publicationYear;
    private int pagesNumber;

    public Book(String name, int publicationYear, int pagesNumber) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.pagesNumber = pagesNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                ", pagesNumber=" + pagesNumber +
                '}';

    }
}

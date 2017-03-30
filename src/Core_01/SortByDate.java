package Core_01;

import java.util.Comparator;

/**
 * Created by Taras on 30.03.2017.
 */
public class SortByDate implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublicationYear() - o2.getPublicationYear();
    }
}

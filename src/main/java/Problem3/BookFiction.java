package Problem3;

import java.util.UUID;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        super(title, author);
        this.genres = genres;
        this.id = UUID.randomUUID();
        System.out.println(id);
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        super(anotherBook);
        this.genres = anotherBook.genres;
        this.id = anotherBook.id;
        System.out.println(id);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if (numOfDaysPastDue <= 0) {
            return 0;
        }
        return lateFeePerDayInDollar * numOfDaysPastDue;
    }
}

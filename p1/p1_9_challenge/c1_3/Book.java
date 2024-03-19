package p1_9_challenge.c1_3;

import java.time.LocalDate;

public class Book implements Comparable<Book> {

    private String title;
    private LocalDate publishDate;
    private String comment;

    public Book(String title, LocalDate publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.publishDate + ", " + this.comment;
    }

    @Override
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

}

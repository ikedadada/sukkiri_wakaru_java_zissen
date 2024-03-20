package p1.p1_9_challenge.c1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book implements Comparable<Book>, Cloneable {

    // Test
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println("署名と発行日が同じであれば等価なものと判定される");
        Date now = new Date();
        Book book1 = new Book();
        book1.title = "Java入門";
        book1.publishDate = now;
        book1.comment = "スッキリわかる";
        Book book2 = new Book();
        book2.title = "Java入門";
        book2.publishDate = (Date) now.clone();
        book2.comment = "ばっちりわかる";
        System.out.println(book1.equals(book2));

        System.out.println("HashSetに格納しても正しく利用できる");
        Set<Book> set = new HashSet<>();
        set.add(book1);
        System.out.println("要素数：" + set.size());
        set.add(book2);
        System.out.println("要素数：" + set.size());

        System.out.println("cloneメソッドで複製できる");
        Book book3 = book1.clone();
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode() == book3.hashCode());

        System.out.println("発行日が古い順を自然順序とする");
        Book book4 = new Book();
        book4.title = "Java入門";
        book4.publishDate = new Date(now.getTime() - 1000);
        book4.comment = "スッキリわかる";
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book4);
        Collections.sort(list);

        for (Book book : list) {
            System.out.println(book.publishDate);
        }

    }

    private String title;
    private Date publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;
        Book book = (Book) o;
        boolean isSameTitle = this.title.equals(book.title);
        boolean isSamePublishDate = this.publishDate.equals(book.publishDate);
        return isSameTitle && isSamePublishDate;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + publishDate.hashCode();
    }

    @Override
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

    @Override
    public Book clone() {
        Book result = new Book();
        result.title = this.title;
        result.publishDate = (Date) this.publishDate.clone();
        result.comment = this.comment;
        return result;
    }

}

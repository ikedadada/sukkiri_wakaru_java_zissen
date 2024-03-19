package p5.p5_7_challenge.c5_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable {

    // Test
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println("署名と発行日とコメントが同じであれば等価なものと判定される");
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
        Book book3 = new Book();
        book3.title = "Java入門";
        book3.publishDate = (Date) now.clone();
        book3.comment = "スッキリわかる";
        System.out.println(book1.equals(book3));

        System.out.println("HashSetに格納しても正しく利用できる");
        Set<Book> set = new HashSet<>();
        set.add(book1);
        System.out.println("要素数：" + set.size());
        set.add(book2);
        System.out.println("要素数：" + set.size());

        System.out.println("cloneメソッドで複製できる");
        Book book4 = book1.clone();
        System.out.println(book1.equals(book4));
        System.out.println(book1.hashCode() == book4.hashCode());

        System.out.println("発行日が古い順を自然順序とする");
        Book book5 = new Book();
        book5.title = "Java入門";
        book5.publishDate = new Date(now.getTime() - 1000);
        book5.comment = "スッキリわかる";
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book5);
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
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public int compareTo(Book o) {
        return CompareToBuilder.reflectionCompare(this, o, "publishDate");
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

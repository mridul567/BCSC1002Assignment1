/*  Created by IntelliJ IDEA.
 *  User: Mridul Bhardwaj (mridul567)
 *  Date: 22/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitISBNNumber;

    public Book(String s) {
        bookName = "Engineering Chemistry";
        authorName = "Shashi Chawla";
        thirteenDigitISBNNumber = "9788120309999";
    }

    public Book(String bookName, String authorName, String thirteenDigitISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getThirteenDigitISBNNumber() {
        return thirteenDigitISBNNumber;
    }

    public void setThirteenDigitISBNNumber(String thirteenDigitISBNNumber) {
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getThirteenDigitISBNNumber());
    }

    public String toString() {
        return String.format("Book Name: %s, Author Name: %s, 13 Digits ISBN Number: %s", getBookName(), getAuthorName(),
                getThirteenDigitISBNNumber()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getThirteenDigitISBNNumber(), book.getThirteenDigitISBNNumber());
    }
}

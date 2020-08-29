/*  Created by IntelliJ IDEA.
 *  User: Mridul Bhardwaj (mridul567)
 *  Date: 22/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] allBooksThatAreCurrentlyAvailable;

    public Library() {
        this.allBooksThatAreCurrentlyAvailable = new Book[15];
        for (int bookIndex = 0; bookIndex < allBooksThatAreCurrentlyAvailable.length; bookIndex++) {
            allBooksThatAreCurrentlyAvailable[bookIndex] = new Book("Book" + (bookIndex + 1));
        }
    }

    public Library(Book[] allBooksThatAreCurrentlyAvailable) {
        this.allBooksThatAreCurrentlyAvailable = allBooksThatAreCurrentlyAvailable;
    }

    public Book[] getAllBooksThatAreCurrentlyAvailable() {
        return allBooksThatAreCurrentlyAvailable.clone();
    }

    public void setAllBooksThatAreCurrentlyAvailable(Book[] allBooksThatAreCurrentlyAvailable) {
        this.allBooksThatAreCurrentlyAvailable = allBooksThatAreCurrentlyAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getAllBooksThatAreCurrentlyAvailable(), library.getAllBooksThatAreCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAllBooksThatAreCurrentlyAvailable());
    }

    @Override
    public String toString() {
        return "Library{" +
                "All Books That Are Currently Available =" + Arrays.toString(allBooksThatAreCurrentlyAvailable) +
                '}';
    }

    /**
     * This method issue a Book to the Student.
     *
     * @param bookName name of the book which is to be issued by the Student .
     */
    public void issueBook(String bookName) {
        System.out.println(bookName + " is issued to the Student");
    }

    /**
     * This method returns the issued Book from the Student.
     *
     * @param bookName the name of the book which is to be returned.
     */
    public void returnBook(String bookName) {
        System.out.println("Thank You for returning, " + bookName + ". Hope it helped you in studies!" );
    }

    /**
     * This method shows a list of all the books issued by the Student.
     */
    public void showAllIssuedBooks() {
        for (Book bookNames : allBooksThatAreCurrentlyAvailable) {
            System.out.println(bookNames);
        }
    }
}

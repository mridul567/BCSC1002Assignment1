/*  Created by IntelliJ IDEA.
 *  User: Mridul Bhardwaj (mridul567)
 *  Date: 22/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] allBooksThatAreCurrentlyAvailable;

    public Book[] getAllBooksThatAreCurrentlyAvailable() {
        return allBooksThatAreCurrentlyAvailable.clone();
    }

    public void setAllBooksThatAreCurrentlyAvailable(Book[] allBooksThatAreCurrentlyAvailable) {
        this.allBooksThatAreCurrentlyAvailable = allBooksThatAreCurrentlyAvailable;
    }

}

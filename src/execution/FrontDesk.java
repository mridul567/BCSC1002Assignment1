/*  Created by IntelliJ IDEA.
 *  User: Mridul Bhardwaj (mridul567)
 *  Date: 22/08/20
 *  Time: 3:52 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {

        private static final int ISSUE_NEW_BOOK = 1;
        private static final int RETURN_ISSUED_BOOK = 2;
        private static final int SHOW_ALL_ISSUED_BOOKS = 3;
        private static final int EXIT = 4;

        public static void main(String [] args) {
            Scanner scanner =  new Scanner(System.in);
            int studentInput;
            Library library = new Library();
            do {
                System.out.println("_=_=__=_=_ 'Welcome To The Front Desk'");
                System.out.println("How may I help You today?");
                System.out.println("1. Issue a new book for me.");
                System.out.println("2. Return a previously issues book.");
                System.out.println("3. Show me all my issued books.");
                System.out.println("4. Exit.");
                System.out.println("Enter your choice (1..4): ");
                studentInput = scanner.nextInt();
                switch (studentInput) {
                    case ISSUE_NEW_BOOK:
                        System.out.println("Enter the name of the book you want to issue: ");
                        scanner.nextLine();
                        String bookName = scanner.nextLine();
                        library.issueBook(bookName);
                        break;
                    case RETURN_ISSUED_BOOK:
                        System.out.println("Enter the name of the book which you want to return: ");
                        scanner.nextLine();
                        bookName = scanner.nextLine();
                        library.returnBook(bookName);
                        break;
                    case SHOW_ALL_ISSUED_BOOKS:
                        library.showAllIssuedBooks();
                        break;
                    case EXIT:
                        System.out.println("Thanks for using Library Book Inventory System.");
                        break;
                    default:
                        System.out.println("WRONG CHOICE");
                }
            }while (studentInput != EXIT);
            scanner.close();
        }
}

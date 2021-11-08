/**
 * 
 */
package com.bookapp.main;

import java.util.Scanner;

import com.bookapp.bean.Book;
import com.bookapp.dao.BookImpl;
import com.bookapp.dao.BookInter;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

/**
 * @author SrimanthChinta
 *
 */
public class Client {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		BookInter bookInter = new BookImpl();
		System.out.println("1.Add book to database");
		System.out.println("2.Get all books from database");
		System.out.println("3.Retrieve book by ID");
		System.out.println("4.Retrieve book by category");
		System.out.println("5.Retrieve book by author");
		System.out.println("6.Update book price by ID");
		System.out.println("7.Delete book by ID");
		System.out.println();
		System.out.println("8.Exit");

		System.out.println();
		System.out.println("Choose any...");
		Scanner scan;
		try {
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			scan = new Scanner(System.in);
			if (option == 1) {
				System.out.print("Enter book ID: ");
				int bookId = scan.nextInt();
				System.out.print("Enter book title: ");
				String title = scan.next();
				System.out.print("Enter book category: ");
				String category = scan.next();
				System.out.print("Enter book author: ");
				String author = scan.next();
				System.out.print("Enter book price: ");
				int price = scan.nextInt();
				Book book = new Book(title, author, category, bookId, price);
				bookInter.addBook(book);
				System.out.println("Book added to the database");
			} else if (option == 2) {
				System.out.println();
				System.out.println("Retrieving all books from database: ");
				System.out.println();
				bookInter.getAllBooks();
			} else if (option == 3) {
				System.out.println();
				System.out.print("Enter book ID to retrieve book details: ");
				int retrieveById = scan.nextInt();
				try {
					System.out.println();
					System.out.println("Searching details...");
					System.out.println();
					System.out.println(bookInter.getBookById(retrieveById));
				} catch (BookNotFoundException e1) {
					System.out.println(e1.getMessage());

				}
			} else if (option == 4) {
				System.out.println();
				System.out.print("Enter book category to retrieve book details : ");
				String retrieveByCategory = scan.next();
				try {
					System.out.println();
					System.out.println("Retrieving details...");
					System.out.println();
					System.out.println(bookInter.getBookByCategory(retrieveByCategory));
				} catch (CategoryNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
			} else if (option == 5) {
				System.out.println();
				System.out.print("Enter book author name to retrieve book details : ");
				String retrieveByAuthor = scan.next();
				try {
					System.out.println();
					System.out.println("Searching details...");
					System.out.println();
					System.out.println(bookInter.getBookByAuthor(retrieveByAuthor));
				} catch (AuthorNotFoundException e1) {
					System.out.println(e1.getMessage());
				}

			} else if (option == 6) {
				System.out.println();
				System.out.print("price updated to : ");
				int updatedPrice = scan.nextInt();
				System.out.print("at the ID : ");
				int id = scan.nextInt();

				bookInter.updateBook(id, updatedPrice);
				

			} else if (option == 7) {
				System.out.println();
				System.out.print("Enter book ID to delete : ");
				int deleteId = scan.nextInt();
				try {
					bookInter.deleteBook(deleteId);
					
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			} else if (option == 8) {
				System.exit(0);
			} else {
				System.out.println("Choose the correct option");
			}
			scan.close();
		} catch (Exception e) {
			System.out.println("Input--error");
		}
	}

}

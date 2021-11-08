/**
 * 
 */
package com.bookapp.dao;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

/**
 * @author SrimanthChinta
 *
 */
public interface BookInter {
	void addBook(Book book);

	boolean deleteBook(int bookId) throws BookNotFoundException;

	Book getBookById(int bookId) throws BookNotFoundException;

	boolean updateBook(int bookId, int price) throws Exception;

	void getAllBooks();

	Book getBookByAuthor(String author) throws AuthorNotFoundException;

	Book getBookByCategory(String category) throws CategoryNotFoundException;

}

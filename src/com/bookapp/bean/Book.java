/**
 * 
 */
package com.bookapp.bean;

/**
 * @author SrimanthChinta
 *
 */
public class Book {

	String title, author, category;
	int bookId;
	double price;

	public Book(String title, String author, String category, int bookId, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.bookId = bookId;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[title=" + title + ", author=" + author + ", category=" + category + ", bookId=" + bookId + ", price="
				+ price + "]";
	}
}

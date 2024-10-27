package lowleveldesign.librarymanagementsystem.model;

import java.util.Date;

public class BookItem {

	private Book book;
	
	private String barCode;
	
	private User borrowedBy;
	
	private Date borrowedDate;
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public boolean isAvailable() {
		return borrowedBy == null;
	}

	public User getBorrowedBy() {
		return borrowedBy;
	}

	public void setBorrowedBy(User borrowedBy) {
		this.borrowedBy = borrowedBy;
	}

	public Date getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public BookItem(Book book, String barCode, User borrowedBy, Date borrowedDate) {
		super();
		this.book = book;
		this.barCode = barCode;
		this.borrowedBy = borrowedBy;
		this.borrowedDate = borrowedDate;
	}

	
}

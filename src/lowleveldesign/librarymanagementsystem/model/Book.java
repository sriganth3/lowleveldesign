package lowleveldesign.librarymanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String isbn;

	private String title;

	private int pages;

	private String description;

	private double borrowCost;

	private List<String> authors = new ArrayList<>();

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public double getBorrowCost() {
		return borrowCost;
	}

	public void setBorrowCost(double borrowCost) {
		this.borrowCost = borrowCost;
	}

	public Book(String isbn, String title, int pages, String description, double borrowCost, List<String> authors) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.description = description;
		this.borrowCost = borrowCost;
		this.authors = authors;
	}
	
	

}

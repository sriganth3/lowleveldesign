package lowleveldesign.librarymanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import lowleveldesign.librarymanagementsystem.model.BookItem;

public class InventoryManagement {
	
	private List<BookItem> bookItem;

	public InventoryManagement() {
		super();
		this.bookItem = new ArrayList<>();
	}


}

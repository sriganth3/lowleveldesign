package lowleveldesign.librarymanagementsystem.model;

import java.util.ArrayList;
import java.util.List;


public abstract class User {
    private String name;
    private String id;
    private List<Book> booksLoaned = new ArrayList<>();
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }

	public abstract UserType getUserType();
	
	public List<Book> getBooksLoaned(){
		return booksLoaned;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBooksLoaned(List<Book> booksLoaned) {
		this.booksLoaned = booksLoaned;
	}
	
}

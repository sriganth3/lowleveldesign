package lowleveldesign.librarymanagementsystem.model;

public class Transaction {
	
	private String id;
	
	private TransactionType transactionType;
	
	private double cost;

	private BookItem bookItem;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public BookItem getBookItem() {
		return bookItem;
	}

	public void setBookItem(BookItem bookItem) {
		this.bookItem = bookItem;
	}

	public Transaction(String id, TransactionType transactionType, double cost, BookItem bookItem) {
		super();
		this.id = id;
		this.transactionType = transactionType;
		this.cost = cost;
		this.bookItem = bookItem;
	}
	

}

package lowleveldesign.librarymanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import lowleveldesign.librarymanagementsystem.model.Transaction;

public class TransactionManagement {

	List<Transaction> transactions;

	public TransactionManagement() {
		super();
		this.transactions = new ArrayList<>();
	}
	
}

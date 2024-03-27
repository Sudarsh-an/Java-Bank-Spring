package com.cestar.beans;

import java.sql.Date;

public class Transaction {

	private int transaction_id;

	private int from_account_id;

	private int to_account_id;

	private int amount;

	private String transaction_type;

	private Date date;

	public Transaction(int transaction_id, int from_account_id, int to_account_id, int amount, String transaction_type,
			Date date) {
		super();
		this.transaction_id = transaction_id;
		this.from_account_id = from_account_id;
		this.to_account_id = to_account_id;
		this.amount = amount;
		this.transaction_type = transaction_type;
		this.date = date;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public int getFrom_account_id() {
		return from_account_id;
	}

	public void setFrom_account_id(int from_account_id) {
		this.from_account_id = from_account_id;
	}

	public int getTo_account_id() {
		return to_account_id;
	}

	public void setTo_account_id(int to_account_id) {
		this.to_account_id = to_account_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", from_account_id=" + from_account_id
				+ ", to_account_id=" + to_account_id + ", amount=" + amount + ", transaction_type=" + transaction_type
				+ ", date=" + date + "]";
	}

}

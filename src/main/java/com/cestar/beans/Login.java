package com.cestar.beans;

public class Login {

	private int client_id;

	private String password;

	public Login(int client_id, String password) {
		super();
		this.client_id = client_id;
		this.password = password;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [client_id=" + client_id + ", password=" + password + "]";
	}

}

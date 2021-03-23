package com.modernjava.funcprogramming.realexample;

// this will be a functional interface
public interface AccountFactory {
	public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}

package org.ms.aopdemo.dao;

import org.ms.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + ":Doing my db work: adding an account");
	}
}

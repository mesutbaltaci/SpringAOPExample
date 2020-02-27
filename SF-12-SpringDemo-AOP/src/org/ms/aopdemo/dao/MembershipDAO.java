package org.ms.aopdemo.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		System.out.println(getClass() + ":doing stuff adding a membership account");
	}
}

package org.ms.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect 
@Component
public class MyDemoLoggingAspect {

	//this is where we add all of our related advices for logging
	
	
	//lets start an @Before advice
	
	
	//@Before("execution(public void add*())") //runs before all starting with add methods in any class
	//@Before("execution( * addAccount(org.ms.aopdemo.Account))") //runs before addaccount methods with account parameters pointcuts language
	//param (..) means 0 to many params
	//@Before("execution(public void org.ms.aopdemo.dao.AccountDAO.add*())") //runs before just accounddao add methods pointcuts language
	
	@Before("execution(* add*(org.ms.aopdemo.Account))") //runs just with param we need fully qualified class name
	public void beforeAddAccountAdvice() {
		System.out.println("\n Executing @Before advice on addAccount()");
	}
	
}

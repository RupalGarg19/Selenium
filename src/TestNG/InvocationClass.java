package TestNG;

import org.testng.annotations.Test;

public class InvocationClass {
	
	@Test(invocationCount = 6, threadPoolSize = 3)
	public void Test01() {		
		System.out.println("I am in Test01 - Thread ID = " + Thread.currentThread().getId() );			
	}
	
	@Test
	public void Test02(){
	   System.out.println("---- START ----");
	}
	@Test(invocationCount=5)
	public void Test03(){
	   System.out.println("---- Success ----");
	}
	@Test
	public void Test04(){
	   System.out.println("---- END ----");
	}

}

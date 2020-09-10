package test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"url", "manager"})
	@Test(groups= {"smoke"})
	public void arse3(String thisismyurl, String managername) {
		System.out.println("toure");
		System.out.println("hey kolo toure, arsenals site is this"+ thisismyurl);
		System.out.println("also note that ur manager name is Legendary " + managername);
	}
	
	@BeforeTest
	public void arse4() {
		System.out.println("before test");
	}
	
	
	

}

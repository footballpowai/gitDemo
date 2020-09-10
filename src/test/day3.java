package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	

	@BeforeClass
	public void chel11() {
		System.out.println("before class");
	}
	@AfterClass
	public void chel111() {
		System.out.println("after class");
	}

	@Test(groups= {"smoke"})
	public void chel1() {
		System.out.println("lampard");
	}
	
	@Test
	public void chel2() {
		System.out.println("terry");
	}
	
	@AfterSuite
	public void aftrsuite() {
		System.out.println("I am last one  suite");
	}
	
	
	@AfterMethod
	public void aftermethd() {
		System.out.println("run me after every meathod");
	}
	
	@BeforeMethod
	public void beformthd() {
		System.out.println("run me before every meathod");
	}
	
	
	
	
	@Test(enabled = false)
	public void chel3() {
		System.out.println("shevchenko");
	}
	
	@Test
	public void africans1() {
		System.out.println("drogba");
	}

	@Test
	public void africans2() {
		System.out.println("demba ba");
	}
	

	@BeforeSuite
	public void bfrsuite() {
		System.out.println("I am number one before suite");
	}
	
	
	@Parameters ({"url", "manager"})
	@Test(dependsOnMethods= {"chel2"})
	public void africans3(String urlnamebaba, String managerrebaba) {
		System.out.println("kante");
		System.out.println(urlnamebaba);
		System.out.println(managerrebaba);
		
	}

}

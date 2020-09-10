package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups= {"smoke"})
	
	public void arse1 () {
		System.out.println("fabregas");
	}
	
	
	@AfterTest
	public void arseafter () {
		System.out.println("after test arsenal");
	}
	@Test(dataProvider = "dataimpt")
	public void arse2 (String strength, String weakness) {
		System.out.println("diaby");
		System.out.println(strength);
		System.out.println(weakness);
	}
	
	
	@DataProvider
	public Object[][] dataimpt() {
		Object[][] datahai = new Object[3][2];
		datahai[0][0]= "1 username is good with right foot";
		datahai[0][1]= "1 password is good with left foot";
		datahai[1][0]= "2 username is good with composure";
		datahai[1][1]= "2 password is bad with agression";
		datahai[2][0]= "3 username is good with heading";
		datahai[2][1]= "3 password is good with chesting";
		return datahai;

		
		
	}

}

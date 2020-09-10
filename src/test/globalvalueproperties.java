package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalvalueproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties propps = new Properties();
		FileInputStream fiss = new FileInputStream("/Users/vishal/eclipse-workspace/TestNGTutorial/src/dddd.properties");
		propps.load(fiss);
		System.out.println(propps.getProperty("url"));
		
		propps.setProperty("url", "chelsea.com");
		System.out.println(propps.getProperty("url"));
		

		

		
		
		
		
		FileOutputStream foss = new FileOutputStream("/Users/vishal/eclipse-workspace/TestNGTutorial/src/dddd.properties");
		propps.store(foss, "newurl");

		

	}

}

package first.ng.lesson;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	
	
	
	
// it is not countED AS TEST it is just feature
	@BeforeTest  // same like before class
	 public void BeforeTest()
	 {
		System.out.println("BeforeTest");
		
	 }
	
	@BeforeMethod
	 public void BeforeMethod()
	 {
		System.out.println("BeforeMethod");
		
	 }
@Test
 public void FirstTest()
 {
	System.out.println("Fisrt");
	
 }

@Test
public void SecondTest()
{
	System.out.println("Second");
	
}

@AfterMethod 
public void AfterMethod()
{
	System.out.println("@AfterMethod");
	
}
// run by alpaatich a b c d  test case name
//@AfterTest  // same like After classs
@Test(timeOut=2000)
public void TimeOuttest() throws InterruptedException 
{
	System.out.println("@AfterTest");
	 TimeUnit.MILLISECONDS.sleep(1000); 
}
}

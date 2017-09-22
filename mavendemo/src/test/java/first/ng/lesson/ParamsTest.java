package first.ng.lesson;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamsTest {

	
	
	@Test(dataProvider="getData")
	 public void FirstTest(Object uname,Object since)
	 {
		//System.out.println("name" + uname + "subject " + since);
		
	 }
	
	@DataProvider
	public Object[][] getData(){
		Object obj[][]= {
				{"Ahmed","ghazali"},{"is theking","think"}	
				
		};
		System.out.println("name" + obj[0][0] + "subject " + obj[0][1]);
		System.out.println("name" + obj[1][0] + "subject " + obj[1][1]);
		return obj;
		
		
	}
}

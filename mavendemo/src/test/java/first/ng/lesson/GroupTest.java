package first.ng.lesson;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups={"group1"})
	 public void FirstGroup()
	 {
		System.out.println("FirstGroup");
		
	 }

	@Test(groups={"group2"})
	public void SecondGroup()
	{
		System.out.println("SecondGroup");
		
	}
}

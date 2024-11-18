package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:flipkart.com");
		
		String act_title = driver.getTitle();
		if(act_title.equals("flipkart")) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}
		driver.close();
	}
	

}

package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ChromeOptions co =new ChromeOptions();
	   co.addArguments("--remote-allow-access-origins*=");
	   WebDriver driver = new ChromeDriver(co);
	   driver.manage().window().maximize();
	   driver.get("https://www.indiaplays.com/");	
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
	}

}

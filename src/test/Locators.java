package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		 
		WebDriver driver;
	

		System.setProperty("webdriver.chrome.driver", "/home/varshinihebbart/Downloads/chromedriver");
	  
		
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
	 WebElement lg=driver.findElement(By.xpath("//a[@class='login']"));
	 lg.click();

	 WebElement wb=driver.findElement(By.xpath("//*[contains(text(),'Welcome back!')]"));


	 WebElement un=driver.findElement(By.xpath("//input[@name='user_login']"));
	 un.sendKeys("Varshini");

	 WebElement ck=driver.findElement(By.xpath("//input[@id='remember-me']"));
	 ck.click();
 }

 
 


}

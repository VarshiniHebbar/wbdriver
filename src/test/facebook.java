package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		

		System.setProperty("webdriver.chrome.driver", "/home/varshinihebbart/Downloads/chromedriver");
	  
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
	/* WebElement lg=driver.findElement(By.xpath("//input#email"));
	 lg.sendKeys("abc@email.com");

	 WebElement pwd=driver.findElement(By.xpath("//input[@name='pass'] "));
	 pwd.sendKeys("12345");
	 
	 WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	 login.click();*/
	 
	/* We/bElement lg=driver.findElement(By.cssSelector("//input[@id='email'] "));
	 lg.sendKeys("abc@email.com");

	 WebElement pwd=driver.findElement(By.cssSelector("//input#pass"));
	 pwd.sendKeys("12345");
	 
	 WebElement login=driver.findElement(By.cssSelector("//button[@name='login']"));
	 login.click(); */
	 
	 WebElement create=driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
	 create.click();
	 
	 WebElement name=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
     name.sendKeys("Amul");
     WebElement scnd=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
     scnd.sendKeys("Raj");
     WebElement mbl = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
     mbl.sendKeys("8234564563");

	 WebElement pwd=driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]"));
     pwd.sendKeys("AmulRaj");
     
	 WebElement month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
     
     Select ddmonth = new Select(month);
     
     ddmonth.selectByIndex(1);
     
     //ddmonth.selectByValue("2");
     
    //ddmonth.selectByVisibleText("Feb");
     
    WebElement day = driver.findElement(By.xpath("//*[@name='birthday_day']"));
     
     Select date = new Select(day);
     
     date.selectByIndex(20);
     
     WebElement year = driver.findElement(By.xpath("//*[@name='birthday_year']"));
     
     Select ddyear = new Select(year);
     
     ddyear.selectByVisibleText("1997");
     
     WebElement gender=driver.findElement(By.xpath("//input[@name=\"sex\"]"));
     gender.click();
     
     WebElement signin=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
     signin.click();

	}

}

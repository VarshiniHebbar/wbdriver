package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	WebDriver driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stuB
	    LoginTest obj = new LoginTest();
	    obj.setup();
	    obj.login();
	    obj.close();
		
		
	}


public void setup() {

		System.setProperty("webdriver.chrome.driver", "/home/varshinihebbart/Downloads/chromedriver");
	    System.setProperty("webdriver.gecko.driver", "/home/varshinihebbart/Downloads/geckodriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
}
 public void login() {
		
		WebElement lnklogin = driver.findElement(By.linkText("Log in"));
		lnklogin.click();
		
		WebElement editUsername = driver.findElement(By.name("user_login"));
		editUsername.sendKeys("Varshini.Hebbar@tecnotree.com");
		WebElement editPwd = driver.findElement(By.name("user_pwd"));
		editPwd.sendKeys("123455666");
		WebElement chkBox = driver.findElement(By.className("rememberMe"));
		chkBox.click();
		WebElement btnPwd = driver.findElement(By.name("btn_login"));
		btnPwd.click();
		
        WebElement error = driver.findElement(By.id("msg_box"));
        
        String ActError = error.getText();
        
        String ExpError = "The email or password you have entered is invalid.";
        
        if(ActError.equals(ExpError)) {
            
            System.out.println("TC Passed");
            
        }else {
            
            System.out.println("TC Failed");
        }
 }

 public void close() {
	 

		driver.quit();
 }
 
}
		
		
		
				
		

		
		


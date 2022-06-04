package Automation.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet304\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		
		driver.findElement(By.xpath("(//div[@class='nb__19hcF'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='tel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7997484693");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nb-switch-toggle xs']")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("login-signup-form-login-radio-password")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-signup-form__password-input")).sendKeys("umes2705");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("listPageSearchLocality")).sendKeys("raja");
		Thread.sleep(2000);
		driver.findElement(By.id("listPageSearchLocality")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();		
		
//		driver.close();
	}
}
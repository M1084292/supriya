package Automation.Sample;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RentPayment {

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
		driver.findElement(By.id("login-signup-form__password-input")).sendKeys("supriya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Thread.sleep(1000);
		//packers
		driver.findElement(By.xpath("//div[@id='pnmHomeTile']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		
		driver.findElement(By.xpath("(//input[@id='pnmLandingPageFromLocalitySearch'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='pnmLandingPageFromLocalitySearch'])[2]")).sendKeys("jal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='pnmLandingPageFromLocalitySearch'])[2]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		driver.findElement(By.xpath("(//input[@id='pnmLandingPageToLocalitySearch'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='pnmLandingPageToLocalitySearch'])[2]")).sendKeys("maj");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='pnmLandingPageToLocalitySearch'])[2]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='pnmGetRealPriceButtonDesktop'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromFloorNo']")).click();
		driver.findElement(By.xpath("//input[@id='fromFloorNo']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='toFloorNo']")).click();
		driver.findElement(By.xpath("//input[@id='toFloorNo']")).sendKeys("1");
		
	}

}
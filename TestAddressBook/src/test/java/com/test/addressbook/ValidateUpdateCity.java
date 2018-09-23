package com.test.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateUpdateCity {
WebDriver driver;
	
	@BeforeClass
	public void doBefore() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Documents\\Shelza\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://a.testaddressbook.com/addresses/new");
	

}
	
	
	@Test
	public void updatecity() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("she3za@g0a53.com");
		driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("sharma");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"address_city\"]")).sendKeys("London");
		
	}
	
	@AfterClass
	public void aftercity() {
		driver.quit();
	}
	
	
}
	

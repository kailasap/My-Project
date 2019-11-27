package org.test.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN 10\\eclipse-workspace\\MavenFirst\\File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement text1 = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		text1.click();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("abc");
		WebElement pass = driver.findElement(By.id("label2"));
		pass.sendKeys("abc");
		
		WebElement log = driver.findElement(By.id("Button2"));
		log.click();

}}

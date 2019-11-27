package org.test.maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN 10\\eclipse-workspace\\MavenFirst\\File\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	WebElement type = driver.findElement(By.name("q"));
	type.sendKeys("facebook");
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement clic = driver.findElement(By.xpath("//span[text()='Facebook - Log In or Sign Up']"));
	clic.click();
	WebElement usernam = driver.findElement(By.id("email"));
	usernam.sendKeys("abc@123");
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
		
}
}

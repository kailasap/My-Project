package org.test.maven;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Junit1 {
static WebDriver driver;
@AfterClass
public static void closeBrowser() {
	System.out.println("close");
}
@BeforeClass
public static void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN 10\\eclipse-workspace\\MavenFirst\\File\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
	String url = driver.getCurrentUrl();
	Assert.assertEquals("https://en-gb.facebook.com/r.php?locale=en_GB",url);
	Assert.assertTrue(url.contains("facebook"));
}
@After
public void endTime() {
    Date d= new Date();
	System.out.println(d);
}
@Before
public void startTime() {
	Date d1=new Date();
	System.out.println(d1);
}
@Test
public void tc1() {
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("kailas");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("kailu");
	String att = pass.getAttribute("value");
    Assert.assertTrue(att.contains("u"));
	System.out.println(att);
}

@Test
public void tc2() {
	WebElement clk = driver.findElement(By.id("loginbutton"));
	clk.click();

}

}

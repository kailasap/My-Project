package org.test.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN 10\\eclipse-workspace\\MavenFirst\\File\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
	driver.manage().window().maximize();
	
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	for(int i=0;i<4;i++) {
		WebElement r = rows.get(i);
		String text = r.getText();
		System.out.println(text);
	}
	
	List<WebElement> header = driver.findElements(By.tagName("th"));
	for (int i = 0; i <4; i++) {
		WebElement h = header.get(i);
		String text2 = h.getText();
		System.out.println(text2);
	    
	}
	
	List<WebElement> cells = driver.findElements(By.tagName("td"));
	for (int i = 0; i < 4; i++) {
		WebElement c = cells.get(i);
		String text3 = c.getText();
		System.out.println(text3);
	}
	
}
}

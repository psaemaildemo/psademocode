package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G://selenium files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.name("email")).sendKeys("pankaj@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("testing123");
		driver.findElement(By.name("login")).click();
	}
}

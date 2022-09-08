package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G://selenium files//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.name("email")).sendKeys("pankaj@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("testing123");
		driver.findElement(By.name("login")).click();
	}
}

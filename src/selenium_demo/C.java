package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.opera.OperaDriver;

public class C {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "G://selenium files//operadriver_win64//operadriver.exe");
		OperaDriver driver = new OperaDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("pankaj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("testing123");
		driver.findElement(By.name("login")).click();
	}
}

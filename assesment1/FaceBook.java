package assesment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions ();
		options.addArguments("--remote-allow-origins=*","start-maximized");
		ChromeDriver driver = new ChromeDriver (options);

		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.facebook.com/");
		    driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		    driver.findElement(By.name("firstname")).sendKeys("arun");
		    driver.findElement(By.name("lastname")).sendKeys("chiran1997");
			driver.findElement(By.name("reg_email__")).sendKeys("arunchiranjeevi001@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("arunchiranjeevi001@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("ancj@123");
			WebElement findElement = driver.findElement(By.id("day"));
			Select dropdown1 = new Select(findElement);
			dropdown1.selectByValue("7");
			WebElement findElement3 = driver.findElement(By.name("birthday_year"));
			Select dropdown3 = new Select(findElement3);
			dropdown3.selectByVisibleText("1997");
			WebElement findElement2 = driver.findElement(By.name("birthday_month"));
			Select dropdown2 = new Select(findElement2);
			dropdown2.selectByVisibleText("Mar"); 
			WebElement findElement4 = driver.findElement(By.xpath("//input[@value  ='2']"));
			findElement4.click();
			driver.findElement(By.name("websubmit")).click();
		    System.out.println(driver);
		    driver.close();
		
		
	}

}

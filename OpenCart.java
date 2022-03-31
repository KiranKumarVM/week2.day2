package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("input-username"));
        userName.sendKeys("Shah");
        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Shahkil");
        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("input-lastname");
        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("shah@gmail.com");
        WebElement selCountry = driver.findElement(By.id("input-country"));
        Select Country= new Select(selCountry);
        Country.selectByVisibleText("India");
        WebElement pswd = driver.findElement(By.name("password"));
        pswd.sendKeys("JiraTool");
        driver.close();
        
	
	
	}

}

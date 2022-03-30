package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
        
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("afridi@gmail.com");
		
		WebElement appendEmail = driver.findElement(By.xpath("//label[contains(text(),'Append a text')]/following-sibling::input"));
        appendEmail.sendKeys("ram@gmail.com"); 
	
        WebElement value = driver.findElement(By.name("username"));
        String attribute = value.getAttribute("value");
        System.out.println(attribute);
        
        driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
        
        WebElement fieldPresent = driver.findElement(By.xpath("//label[contains(text(),'is disabled')]/following-sibling::input"));
        boolean enabled = fieldPresent.isEnabled();
        System.out.println(enabled);
	
	
	
	}

}

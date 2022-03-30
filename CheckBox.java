package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[1]")).click();
	    
	    WebElement confirmation = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input"));
	    boolean confirm = confirmation.isSelected();
	    System.out.println(confirm);

	    WebElement deSelection = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]"));
	    if(deSelection.isSelected()) 
	    {
	     deSelection.click();
	    }
        driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[1]")).click();
        driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[2]")).click();
        driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[3]")).click();
        driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[4]")).click();
        driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[5]")).click();
        driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[6]")).click();
	}
}

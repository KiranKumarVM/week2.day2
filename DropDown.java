package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(drop1);
		dd1.selectByIndex(1);
		
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select dd2=new Select(drop2);
		dd2.selectByVisibleText("Loadrunner");
		
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select dd3=new Select(drop3);
		dd3.selectByValue("2");
		
		WebElement drop4 = driver.findElement(By.className("dropdown"));
		Select dd4=new Select(drop4);
		int size = dd4.getOptions().size();
		System.out.println(size);
		
		WebElement sendValue = driver.findElement(By.xpath("//option[contains(text(),'sendKeys')]/parent::select"));
		sendValue.sendKeys("Selenium");
		
		WebElement multiSelect = driver.findElement(By.xpath("//option[contains(text(),'Select your programs')]/parent::select"));
		Select multipleSelect= new Select(multiSelect);
		multipleSelect.selectByValue("1");
		multipleSelect.selectByValue("2");
		multipleSelect.selectByValue("3");
		multipleSelect.selectByValue("4");


	}

}

package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Assignment:1
//FaceBook:
//================================
//// Step 1: Download and set the path 
//// Step 2: Launch the chromebrowser
//// Step 3: Load the URL https://en-gb.facebook.com/
//// Step 4: Maximise the window
//// Step 5: Add implicit wait
//// Step 6: Click on Create New Account button
//// Step 7: Enter the first name
//// Step 8: Enter the last name
//// Step 9: Enter the mobile number
//// Step 10: Enterthe password
//// Step 11: Handle all the three drop downs
//// Step 12: Select the radio button "Female" 
//            ( A normal click will do for this step) 
public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sai");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("98765443212");
		driver.findElement(By.id("password_step_input")).sendKeys("higuys");
		WebElement findDay = driver.findElement(By.id("day"));
		Select day=new Select(findDay);
		day.selectByVisibleText("2");
		
		WebElement findMonth = driver.findElement(By.id("month"));
		Select month=new Select(findMonth);
        month.selectByVisibleText("May");
        
        WebElement findYear = driver.findElement(By.id("year"));
        Select year=new Select(findYear);
        year.selectByVisibleText("1998");
        driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@name='sex']")).click();
	}

}

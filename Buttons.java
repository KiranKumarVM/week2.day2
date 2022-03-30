package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
        
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		WebElement position = driver.findElement(By.id("position"));
		Point point = position.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x value is "+x +"Y value is "+y);
		
		WebElement color = driver.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color:lightgreen");
		System.out.println(cssValue);
		
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		System.out.println(height+" is the Height");
		int width = size.getSize().getWidth();
		System.out.println(width+" is the width");
		
		}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		driver.findElement(By.xpath("//h5[text()='Image']")).click();
        
		driver.findElement(By.xpath("//label[text()='Am I Broken Image?']")).click();
        //broken Image
		
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::im")).click();
		driver.findElement(By.xpath("//h5[text()='Image']")).click();		
	

}
}
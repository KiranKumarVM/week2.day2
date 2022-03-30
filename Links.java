package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		WebElement find = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
        String attribute = find.getAttribute("href");
	    System.out.println(attribute);
	    
        WebElement verify = driver.findElement(By.linkText("Verify am I broken?"));
        verify.click();

        WebElement errorMsg = driver.findElement(By.xpath("//h1[contains(text(),'404')]"));
        String text = errorMsg.getText();
        System.out.println(text);
        if(text.contains("404 Not Found"))
        System.out.println("The Link is Broken");
        else
        System.out.println("Link is not Broken");
	   
        driver.navigate().back();
        
        WebElement home = driver.findElement(By.xpath("//label[@for='position']/preceding-sibling::a"));
	    home.click();
	    driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();

	

	}}

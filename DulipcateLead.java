package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

///*http://leaftaps.com/opentaps/control/main
//
//1	Launch the browser
//2	Enter the username
//3	Enter the password
//4	Click Login
//5	Click crm/sfa link
//6	Click Leads link
//7	Click Find leads
//8	Click on Email
//9	Enter Email
//10	Click find leads button
//11	Capture name of First Resulting lead
//12	Click First Resulting lead
//13	Click Duplicate Lead
//14	Verify the title as 'Duplicate Lead'
//15	Click Create Lead
//16	Confirm the duplicated lead name is same as captured name
//17	Close the browser (Do not log out)


public class DulipcateLead {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		driver.findElement(By.xpath("//*[text()='Email']")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("sangi.kings@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement findName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String text = findName.getText();
    	System.out.println("Name of First Resulting lead is "+text);
    	Thread.sleep(5000);
    	//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
    	findName.click();
    	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
			System.out.println("Navigated in Proper Page");
		else
			System.out.println("Error page");
		
		driver.findElement(By.name("submitButton")).click();
		
		WebElement capturedName = driver.findElement(By.id("viewLead_firstName_sp"));
		String text2 = capturedName.getText();
		if(text2.equals(text))		
			System.out.println("Name Matches");
	   else	
		System.out.println("Different Name");
	
		driver.close();
			
	}

}

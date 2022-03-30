package week2.day2;

import java.time.Duration;

import org.apache.hc.core5.util.ByteArrayBuffer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

///*http://leaftaps.com/opentaps/control/main
//
//* 1	Launch the browser
//* 2	Enter the username
//* 3	Enter the password
//* 4	Click Login
//* 5	Click crm/sfa link
//* 6	Click Leads link
//* 7	Click Find leads
//* 8	Enter first name
//* 9	Click Find leads button
//* 10 Click on first resulting lead
//* 11 Verify title of the page
//* 12 Click Edit
//* 13 Change the company name
//* 14 Click Update
//* 15 Confirm the changed name appears
//* 16 Close the browser (Do not log out)
public class EditLead {

	public static void main(String[] args) {
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
		
		WebElement firstName = driver.findElement(By.xpath("//label[text()='First name:']/following::input[@name='firstName'][3]"));
		firstName.sendKeys("Ashokraj");
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead | opentaps CRM"))
			System.out.println("Title is verified");
		else
			System.out.println("Title is not properly Verified");
		
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
		String attribute = companyName.getAttribute("value");
		
		driver.findElement(By.name("submitButton")).click();
		
		WebElement text = driver.findElement(By.id("viewLead_companyName_sp"));
		String text2 = text.getText();
		
		if(text2.contains(attribute))
			System.out.println("Same Name presented");
		else
			System.out.println("Not same Name");
		
		
		
		

	}

}

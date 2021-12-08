package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //1	Launch the browser
		 driver.get("http://leaftaps.com/opentaps/");
		 //2	Enter the username
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 //3	Enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //4	Click Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //5	Click crm/sfa link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //6	Click Leads link
		 
		 driver.findElement(By.linkText("Leads")).click();
		 // 7	Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();
			//8	Enter first name
			driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[1]")).click();
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("princila");
			//9	Click Find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			//10 Click on first resulting lead
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			//String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			//System.out.println(text);
			//11 Verify title of the page
			String title = driver.getTitle();
			System.out.println(title);
			//12 Click Edit
			driver.findElement(By.linkText("Edit")).click();
			//13 Change the company name
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
			//14 Click Update
			driver.findElement(By.name("submitButton")).click();
			//15 Confirm the changed name appears
			//16 Close the browser (Do not log out)
			//driver.close();
	}

}

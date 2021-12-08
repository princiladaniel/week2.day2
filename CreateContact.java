package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	   driver.get("http://leaftaps.com/opentaps/control/login");
	   //2. Enter UserName and Password Using Id Locator
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //3. Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		 // 4. Click on CRM/SFA Link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //5. Click on contacts Button
		 driver.findElement(By.linkText("Contacts")).click();
		 //6. Click on Create Contact
		 driver.findElement(By.linkText("Create Contact")).click();
		 //7. Enter FirstName Field Using id Locator
		 driver.findElement(By.id("firstNameField")).sendKeys("princy");
		 //8. Enter LastName Field Using id Locator
		 driver.findElement(By.id("lastNameField")).sendKeys("Edward");
		 //9. Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Roseline");
		 System.out.println(driver.findElement(By.id("firstNameField")).getAttribute("value"));
		 //10. Enter LastName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raj");
		 //11. Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testtrainer");
		 //12. Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Roles and Responsibilities Must have very strong concepts of Software "
		 		+ "testing/ Engineer... software testing; Selenium; testNG");
		 //13. Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("princila@testleaf.com");
		 //14. Select State/Province as NewYork Using Visible Text
		 WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select Province =new Select(state);
		 Province.selectByVisibleText("New York");
		 //15. Click on Create Contact
		 driver.findElement(By.name("submitButton")).click();
		 //16. Click on edit button 
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 //17. Clear the Description Field using .clear
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 //18. Fill ImportantNote Field with Any text
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Become a Best Trainer");
		 //19. Click on update button using Xpath locator
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 // 20. Get the Title of Resulting Page
		 String title = driver.getTitle();
		 System.out.println(title);
		 

	}

}

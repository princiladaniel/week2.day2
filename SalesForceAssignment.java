
package week2.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("princila");
		 driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Edward");
		 driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("princila@testleaf.com");
		 WebElement dropdown = driver.findElement(By.name("UserTitle"));
		 Select job = new Select(dropdown);
		 job.selectByVisibleText("Marketing / PR Manager");
		 driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		 WebElement dropdowncompany = driver.findElement(By.name("CompanyEmployees"));
		 Select company = new Select(dropdowncompany);
		 company.selectByValue("75");
		 driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9387654672");
		 WebElement dropdowncountry = driver.findElement(By.name("CompanyCountry"));
		 Select country = new Select(dropdowncountry);
		 country.selectByValue("CA");
		 WebElement dropdownstate = driver.findElement(By.name("CompanyState"));
		 Select state = new Select(dropdownstate);
		 state.selectByIndex(5);
		 //driver.findElement(By.xpath("//div[@class='checkbox-ui")).click();
		 WebElement chkBox1 = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]"));
		 driver.executeScript("arguments[0].click();", chkBox1);
	}		 
}
/* Assignment:2
==================================================
SalesForce:
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL 
           https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Fill in all the text boxes
// Step 7: Handle all the dropdowns
// Step 8: Click the check box
// Step 9: Close the browser
*Note: No need click Start my freeTrial*/
/* WebDriverManager.chromedriver().setup();

				// Step 2 : Launch the Chrome Browse
				ChromeDriver driver = new ChromeDriver();

				// Step 3: Load the URL
				driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

				// Step 4 : Maximize the Browser
				driver.manage().window().maximize();

				// Step 5 : Add Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				// Step 6: Fill in all the text boxes

				driver.findElement(By.name("UserFirstName")).sendKeys("Test");

				driver.findElement(By.name("UserLastName")).sendKeys("Leaf");

				driver.findElement(By.name("UserEmail")).sendKeys("testleaf@gmail.com");

				driver.findElement(By.name("CompanyName")).sendKeys("Test Leaf Pvt Lmt");

				driver.findElement(By.name("UserPhone")).sendKeys("9090909090");

				// Step 7: Handle all the dropdowns

				WebElement title = driver.findElement(By.name("UserTitle"));
				// Convert the WebElement as Select class (for Webdriver to understand)
				Select select = new Select(title);
				select.selectByVisibleText("IT Manager");

				WebElement emp = driver.findElement(By.name("CompanyEmployees"));
				// Convert the WebElement as Select class (for Webdriver to understand)
				Select select1 = new Select(emp);
				select1.selectByIndex(3);

				WebElement cntry = driver.findElement(By.name("CompanyCountry"));
				// Convert the WebElement as Select class (for Webdriver to understand)
				Select select2 = new Select(cntry);
				select2.selectByVisibleText("India");

				/*WebElement state = driver.findElement(By.name("CompanyState"));
				// Convert the WebElement as Select class (for Webdriver to understand)
				Select select3 = new Select(state);
				select3.selectByVisibleText("India"); */


				// Step 8: Click the check box
				//driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
				//driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[1]")).click();
*/
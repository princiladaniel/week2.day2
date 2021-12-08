package week2.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("princila");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("edward");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("princy123");
		 //driver.findElement(By.xpath("//select[@id='day']"))
		  WebElement dropdown = driver.findElement(By.id("day"));
		 Select day = new Select(dropdown);
		 day.selectByVisibleText("10");
		// select.selectByValue("3");
		// day.selectByIndex(4);
		WebElement dropdownmonth=driver.findElement(By.id("month"));
		Select month = new Select(dropdownmonth);
		month.selectByVisibleText("May");
		WebElement dropdownyear=driver.findElement(By.id("year"));
		Select year = new Select(dropdownyear);
		year.selectByIndex(6);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
/* Assignment:1
FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) */
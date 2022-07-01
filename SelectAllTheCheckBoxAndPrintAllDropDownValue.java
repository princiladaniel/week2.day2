package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllTheCheckBoxAndPrintAllDropDownValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//Print all dropdown value
		
		  List<WebElement> option = driver.findElements(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")); 
		  int size =option.size();//4 
		  for (int i = 0; i < size; i++) {
		  System.out.println(option.get(i).getText()); }
		 
	//Select all check box
	//driver.get("http://www.leafground.com/pages/checkbox.html");
	/*List<WebElement> optionClick = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
	int size2 = optionClick.size();
	for (int i = 0; i < size2; i++) {
		//Select all the check box
		optionClick.get(i).click();
		*/
		
	}
	}

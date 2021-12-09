package Learnselenium;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://Leafground.com/pages/DropDown.html");
WebElement eleFirstDropDown=driver.findElement(By.id("dropdown1"));
Select dropdown=new Select(eleFirstDropDown);
dropdown.selectByVisibleText("Selenium");
//List<WebElement>option=did.getoption();
//System.out.println(option.size());
	}

}

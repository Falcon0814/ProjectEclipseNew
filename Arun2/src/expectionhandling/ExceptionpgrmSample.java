package expectionhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionpgrmSample {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarav\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
  //here shows no such frame
//driver.switchTo().frame("Fail");
try {
	driver.switchTo().alert().accept();
}
catch(NoAlertPresentException e) {
	e.printStackTrace();
}
driver.findElement(By.id("fake")).sendKeys("hello");
try {
	driver.findElement(By.name("fake")).click();
}
catch(NoSuchElementException e) {
	System.out.println("element not found");
	System.out.println("hello");
}
System.out.println("STC");
	}

}

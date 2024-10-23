package Demo.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@BeforeMethod
	public void setup() {
	ChromeOptions options =  new ChromeOptions();
	options.addArguments("--headless");
	driver=new ChromeDriver(options) ;
	driver=new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://cinutedigital.com/contact-us/");
	}
	@Test (priority =1)
	public void demoTesttwo(){
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Test");
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("1234567890");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pranav.patil@testriq.com");
		WebElement pincode = driver.findElement(By.id("pinCode"));
		pincode.sendKeys("400102");
		WebElement dropdown = driver.findElement(By.id("goal"));
		Select s = new Select(dropdown);
		s.selectByIndex(3);
		WebElement next = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-next'])[1]"));
		next.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown1 = driver.findElement(By.id("education"));
		Select w = new Select (dropdown1);
		w.selectByIndex(3);
		WebElement certificate = driver.findElement(By.id("certifications"));
		certificate.sendKeys("Java, C++");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@class='form-check-input course-checkbox'])[11]"));
		checkbox.click();
		WebElement next1 = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-next'])[2]"));
		next1.click();
		
		WebElement startCourse = driver.findElement(By.id("startDay"));
		Select d = new Select (startCourse);
		d.selectByIndex(2);
		
		WebElement timeSlot = driver.findElement(By.id("time-slot"));
		Select e = new Select (timeSlot);
		e.selectByIndex(2);

		WebElement language = driver.findElement(By.id("preferredLanguage"));
		Select f = new Select (language);
		f.selectByIndex(3);

		WebElement comments = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		comments.sendKeys("Thank you");
		WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-success btn-submit']"));
		submitButton.click();
		driver.quit();
	
}
}


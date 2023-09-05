package assignmentFleapo;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


class testCases {
	WebDriver driver;
	
	@BeforeTest
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	void tc1_navigateToUrl() {
		driver.get("https://wishbox2.vercel.app/");
	}
	
	@Test
	void tc2_loginToWebsite() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("3333333333");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='tel'])[4]")).sendKeys("4");
		driver.findElement(By.xpath("(//input[@type='tel'])[5]")).sendKeys("5");
		driver.findElement(By.xpath("(//input[@type='tel'])[6]")).sendKeys("6");
	}
	
	@Test
	void tc3_navigateAndNewWishlist() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	
	@Test
	void tc4_FillDetails() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Wishlist Name']")).sendKeys("Virat Kohli");
		Thread.sleep(1000);
		driver.findElement(By.id("description")).sendKeys("Best player in the world. King Kohli");
		Thread.sleep(1000);
	
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("upload-cover-input")).sendKeys("C:\\Users\\ajay rafayal\\Desktop\\17kohli1.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}

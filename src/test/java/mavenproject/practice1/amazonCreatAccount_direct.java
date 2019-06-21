package mavenproject.practice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazonCreatAccount_direct {
	public static WebDriver driver = null;
	
  @Test
  public void f() throws InterruptedException {
	  
	  Actions option1 = new Actions (driver);
		WebElement tab1=driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]"));
		option1.moveToElement(tab1).build().perform();
		Thread.sleep(5000);
		option1.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"))).click().build().perform();
		
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("zayan malik");
		driver.findElement(By.id("ap_email")).sendKeys("zayanmalik0609@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("!Qaz8520");
		driver.findElement(By.id("ap_password_check")).sendKeys("!Qaz8520");
		
		//if create account is enabled or not (manually)
		Boolean button=driver.findElement(By.id("continue")).isEnabled();
		System.out.println(button);
		//or (automation framework by assert)
		//Assert.assertTrue(driver.findElement(By.id("continue")).isEnabled());
		
		driver.findElement(By.id("continue")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\muzam\\eclipse-workspace\\assainments\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver (); 
		String url = "https://www.amazon.com/";
		driver.get(url);
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

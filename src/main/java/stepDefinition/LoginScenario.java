package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.os.WindowsUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class LoginScenario extends BaseClass{

		WebDriver driver;


	@Before(order=2)
	public void setUP2(){
		System.out.println("##################  This is Before Method");
	}
	@After
	public void zzzzzzzzAfterM1(Scenario s){
		System.out.println("@@@@@@@@@@@@@@@@@@@  This is After Method");
//		if (s.isFailed()) {
//			final byte[] screenshot = ((TakesScreenshot) driver)
//					.getScreenshotAs(OutputType.BYTES);
//			s.embed(screenshot, "image/png"); //stick it in the report
//			s.write("<h1> ScreenShot </h1>");
//		}
	}

	@Given("^User is in Login page$")
	public void user_is_in_Login_page() throws Throwable {
//		WindowsUtils.killByName("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./Exes/chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", "./Exes/IEDriverServer.exe");
		driver = new ChromeDriver(); 
//		driver = new InternetExplorerDriver();//new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^User enter User and Password$")
	public void user_enter_User_and_Password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("pradee246");
		driver.findElement(By.name("password")).sendKeys("Nexus5@123");
	}

	@When("^User Clicks on Login$")
	public void user_Clicks_on_Login() throws Throwable {
		driver.findElement(By.name("username")).submit();
	}

	@Then("^User validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("CRMPRO"));
	}



}

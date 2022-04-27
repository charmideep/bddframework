package stepdefination;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LoginPage;
import junit.framework.Assert;

public class Logindefination {
	
public	WebDriver driver;
public LoginPage  l;

public static Logger logger;
	
	@Given("user lunch chomedriver and get  url {string}")
	public void user_lunch_chomedriver_and_get_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		logger=Logger.getLogger("bddframework");//add logger
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("****lunching browesr****");
		l= new LoginPage(driver);
		logger.info("****lunching url****");
	    driver.get(url);
	}

	@When("user enter username as {string} and password as {string}")
	
	public void user_enter_username_as_and_password_as(String uname, String psw) {
		logger.info("****username and paswword****");
		l.setuser(uname);
		l.setpsw(psw);
	    
	}

	@And("click on login")
	public void click_on_login() throws InterruptedException {
		logger.info("****clickbutton****");
		l.clickonlogin();
		Thread.sleep(3000);
	}

	@Then("user shoul be home page")
	public void user_shoul_be_home_page() throws InterruptedException {
		logger.info("****matching****");
		Thread.sleep(3000);
		String actaul=l.actuals();
		String exe="Administrator";
		Assert.assertEquals(actaul, exe);
		driver.quit();
	   
	}
	@Then("it  should in error")
	public void it_should_in_error() {
		logger.info("****lunching browesr1****");
	   System.out.println("pass");
	}



}

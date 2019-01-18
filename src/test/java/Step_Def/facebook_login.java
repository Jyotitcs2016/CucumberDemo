package Step_Def;

import org.openqa.selenium.By;

import BaseClass.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook_login extends TestBase {
	@Given("^Facebook login page$")
	public void facebook_login_page() throws Throwable {
		startbrowser();
		driver.get("https://en-gb.facebook.com/login/");
	   System.out.println("I am on login page");
	}

	@When("^enter id and password$")
	public void enter_id_and_password() throws Throwable {
		String[] cred= {config.getProperty("id"),config.getProperty("password")};
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(cred[0]);
		System.out.println(cred[0]);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys(cred[1]);
		System.out.println(cred[1]);
		driver.findElement(By.cssSelector("body[dir='ltr']")).click();
		 System.out.println("I have entered id and password");
	}

	@Then("^Login is successfull$")
	public void login_is_successfull() throws Throwable {
		 System.out.println("Login Success");
		 driver.close();
	}


}

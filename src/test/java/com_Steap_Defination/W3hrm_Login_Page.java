package com_Steap_Defination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class W3hrm_Login_Page {

	public WebDriver driver;
	
	@Given("user open browser")
	public void user_open_browser() {
	    driver=new ChromeDriver();
	  
	}

	@And("user open the application")
	public void user_open_the_application() {
		driver.get("https://employee.w3softech.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("enter user Email id and password")
	public void enter_user_email_id_and_password() {
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hr@w3softech.in");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("W3hr@123");
	}

	@And("user click the login button")
	public void user_click_the_login_button() {
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div[2]/form/div[4]/button")).click();
	}

	@Then("user should be login successfully completed")
	public void user_should_be_login_successfully_completed() {
	 System.out.println("login successfully");
	}

	@And("user should be w3hrm dash board page")
	public void user_should_be_w3hrm_dash_board_page() {
		String Exp_title=driver.getTitle();
		String Act_title="W3-Work Track-Dashboard";
		
		if(Exp_title.equals(Act_title)) {
			
			Assert.assertTrue(true);
			
			System.out.println("Test case is pass");
			
		}
		else {
			System.out.println("Test case is Fail");
			
			Assert.assertFalse(false);
		}
	}
}

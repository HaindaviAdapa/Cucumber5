package SeleniumGlueCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Mysteps {

	WebDriver driver;
	
	@Given("User launch Chromebrowser")
	public void user_launch_chromebrowser() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize() ;	
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	@Then("User opens url {string}")
	public void user_opens_url(String TestUrl) {
	     
		driver.get(TestUrl);
	}
	
	
	@When("user logins with username as {string} and password as {string}")
	public void user_logins_with_username_as_and_password_as(String username, String password) throws InterruptedException {
	   
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(5000);
		
	}
	
	
	@Then("Add skills with skillname as {string} and Skill desc as {string}")
	public void add_skills_with_skillname_as_and_skill_desc_as(String skillname, String skilldesc) throws InterruptedException {
	    
		 driver.findElement(By.xpath("//span[text()='Admin']")).click();
		 driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		 driver.findElement(By.xpath("//a[text()='Skills']")).click();
		 driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(skillname);
		  driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(skilldesc);
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		
		
	}
	
	
	@Then("click on logout")
	public void click_on_logout() {
	    
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	
	@Then("Close the browser")
	public void close_the_browser() {
	   
		driver.close();
	}
}

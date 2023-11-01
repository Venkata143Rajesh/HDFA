package BasicPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail {
	public WebDriver driver;
  @Test(priority = 1)
  public void Login() {
	  
  }
  
  @Test(priority = 2)
  public void Logout() {
	  
  }
  @BeforeTest
  public void beforeTest() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&ifkv=AVQVeywv8WjodD5fDf4dHqJKV3uUWfDz2EXFx2V7rL2J7iar2jjefy-QI6HgAgThWwt6Vftzxz8Y2g&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
